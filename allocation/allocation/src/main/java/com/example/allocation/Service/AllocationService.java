package com.example.allocation.Service;

import com.example.allocation.Order.OrderDto;
import com.example.allocation.Order.OrderLineDto;
import com.example.allocation.Release.ReleaseLine;
import com.example.allocation.Release.ReleasePojo;
import com.example.allocation.Repository.AllocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;

@Service

public class AllocationService implements AllocationInterface {

    @Autowired
    AllocationRepo allocationRepo;


    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<ReleasePojo> save(OrderDto order) {
        // OrderDto orderDto1 = new OrderDto();
        //   List<ReleasePojo> releasePojos = new ArrayList<>();
        Set<OrderLineDto> orderLineDtos = new HashSet<>();

        for (OrderLineDto orderLineDto : order.getOrderLines()) {
            String aaa = orderLineDto.getItemId();
            ResponseEntity<String> status = restTemplate.getForEntity("http://192.168.1.234:8084/api/v1/item/itemstatus/" + aaa, String.class);
            System.out.println(status.getBody());

            if (status.getBody().equals("Active")) {
                // String loc = orderLineDto.getItemId();
                String url = "http://192.168.1.9:8084/api/a1/inventory/location/get/" + aaa;
                UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
                builder.queryParam("quantity", orderLineDto.getQuantity());

                String url1 = builder.toUriString();

                ResponseEntity<String> location = restTemplate.exchange(
                        url1,
                        HttpMethod.GET,
                        null, String.class);

                Random rand = new Random();
                 String randomlocation = location.getBody();
//              list.get(rand.nextInt(list.size()));

//                System.out.println(randomlocation);
//                System.out.println("qwertyuiop");

                ReleasePojo releasePojo = new ReleasePojo();

                releasePojo.setOrderId(order.getOrderId());
                releasePojo.setShipFromLocationId(randomlocation);
                releasePojo.setReleaseId(order.getOrderId() + rand.nextInt(10));
                releasePojo.setStatus("Allocated");

                ReleaseLine releaseLine = new ReleaseLine();

                releaseLine.setItemId(orderLineDto.getItemId());
                releaseLine.setQuantity(orderLineDto.getQuantity().toString());
                releaseLine.setOrderLineId(orderLineDto.getOrderLineId());
                releaseLine.setStatus("Allocated");

                List<ReleaseLine> releaseLines = new ArrayList<>();
                releaseLines.add(releaseLine);
                releasePojo.setReleaseLine(releaseLines);

                //   releasePojos.add(releasePojo);

                HttpEntity<ReleasePojo> updaterelease = new HttpEntity<>(releasePojo);
                ResponseEntity<ReleasePojo> releaseresponse = restTemplate.exchange("http://192.168.43.69:8085/wearehouse/api/v1/post/", HttpMethod.POST, updaterelease, ReleasePojo.class);
                // System.out.println(releaseresponse.getBody());

                OrderDto orderDto = new OrderDto();
                orderDto.setOrderStatus("Confirmed");

                HttpEntity<OrderDto> orderstatus = new HttpEntity<>(orderDto);
                ResponseEntity<OrderDto> orderstatusresponse = restTemplate.exchange("http://192.168.1.59:8084/order/api/v1/post", HttpMethod.POST, orderstatus, OrderDto.class);
            }


        }
        return null;
    }


    @Override
    public OrderDto getById(String orderId) {
        return null;
    }


}
