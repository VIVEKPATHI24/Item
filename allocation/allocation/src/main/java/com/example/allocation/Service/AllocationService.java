package com.example.allocation.Service;

import com.example.allocation.Order.OrderDto;
import com.example.allocation.Order.OrderLineDto;
import com.example.allocation.Order.OrderLineStatusDto;
import com.example.allocation.Order.OrderStatusDto;
import com.example.allocation.Release.ReleaseLine;
import com.example.allocation.Release.ReleasePojo;
import com.example.allocation.Repository.AllocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
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

    int loc=1;
    @Override
    // @RequestMapping(value = "/allocation/v1/api/")
    public List<OrderDto> save(OrderDto order) {
        // OrderDto orderDto1 = new OrderDto();
        //   List<ReleasePojo> releasePojos = new ArrayList<>();
        Set<OrderLineDto> orderLineDtos = new HashSet<>();

        for (OrderLineDto orderLineDto : order.getOrderLine()) {
            String aaa = orderLineDto.getItemId();
            ResponseEntity<String> status = restTemplate.getForEntity("http://192.168.1.234:8084/api/v1/item/itemstatus/" + aaa, String.class);
            //  System.out.println(status.getBody());

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

                // Random rand = new Random();
//                String randomlocation = location.getBody();
//              list.get(rand.nextInt(list.size()));

//                System.out.println(randomlocation);

                ReleasePojo releasePojo = new ReleasePojo();

                releasePojo.setOrderId(order.getOrderId());
                releasePojo.setShipFromLocationId(location.getBody());
                System.out.println("locationId - " + location.getBody());
                releasePojo.setReleaseId(order.getOrderId()+(loc+1));
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
                ResponseEntity<ReleasePojo> releaseresponse = restTemplate.exchange("http://192.168.1.252:8085/warehouse/api/v1/create/", HttpMethod.POST, updaterelease, ReleasePojo.class);
                // System.out.println(releaseresponse.getBody());
/*
                OrderStatusDto orderStatusDto = new OrderStatusDto();
                orderStatusDto.setOrderStatus("ALLOCATED");
                orderStatusDto.setOrderId(order.getOrderId());
                OrderLineStatusDto orderlinenew = new OrderLineStatusDto();
                orderlinenew.setItemId(orderLineDto.getItemId());

                orderlinenew.setFulfillmentQuantity(orderLineDto.getQuantity());
                orderlinenew.setOrderLineId(orderLineDto.getOrderLineId());
                orderlinenew.setOrderStatus("ALLOCATED");
                List<OrderLineStatusDto> orderLineStatusDtoList = new ArrayList<>();
                orderLineStatusDtoList.add(orderlinenew);
                orderStatusDto.setOrderLine(orderLineStatusDtoList);

                HttpEntity<OrderStatusDto> orderstatus = new HttpEntity<>(orderStatusDto);
                ResponseEntity<OrderDto> orderstatusresponse = restTemplate.exchange("http://192.168.1.59:8084/order/api/v1/orderstatus/update" , HttpMethod.PUT, orderstatus, OrderDto.class);*/
            }
        }
        return null;
    }

    @Override
    public OrderDto put(OrderDto orderstatusDto) {

        //ResponseEntity<OrderDto> orderstatusresponse = restTemplate.exchange("http://192.168.1.59:8084/order/api/v1/orderstatus/update"+ ooo , HttpMethod.PUT, orderstatus, OrderDto.class);

        return orderstatusDto;
    }


    @Override
    public OrderDto getById(String orderId) {

        return null;
    }


}
