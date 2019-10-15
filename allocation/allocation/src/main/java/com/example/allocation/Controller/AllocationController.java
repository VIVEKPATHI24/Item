package com.example.allocation.Controller;

import com.example.allocation.Order.OrderDto;
import com.example.allocation.Release.ReleasePojo;
import com.example.allocation.Service.AllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/allocation/v1/api/")
public class AllocationController {

    @Autowired
    AllocationService allocationService;

    @PostMapping("/save")
    List<ReleasePojo> save(@RequestBody OrderDto order) {
       // System.out.println("asdfghjklkjhgfdsasdfghjklkjhgfdsa");
        return allocationService.save(order);
    }

    @GetMapping("/get/{id}")
    OrderDto get(@PathVariable("orderId") String orderId) {

        return allocationService.getById(orderId);
    }

}
