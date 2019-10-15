package com.example.allocation.Service;

import com.example.allocation.Order.OrderDto;
import com.example.allocation.Release.ReleasePojo;

import java.util.List;
import java.util.Optional;

public interface AllocationInterface {


    OrderDto getById (String orderId);
    List<ReleasePojo> save(OrderDto order);






}
