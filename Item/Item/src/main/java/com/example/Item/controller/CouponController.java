package com.example.Item.controller;


import com.example.Item.domain.Brands;
import com.example.Item.domain.Coupons;
import com.example.Item.services.IBrandsService;
import com.example.Item.services.ICouponsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/coupon")
public class CouponController {

    @Autowired
    //IItemService iItemService;
    ICouponsService icouponService;
    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("/get/{id}")
    Coupons getById(@PathVariable("id") Long id) {
        Coupons coupons = icouponService.getById(id).get();
/////   objectMapper.convertValue(item, Item.class);
        return coupons;
    }

    @PostMapping("/save")
    Coupons save(@RequestBody Coupons coupons) {
        return icouponService.save(coupons);
    }

    @DeleteMapping("/delete/{id}")
    void deleteById(@PathVariable("id") Long id)
    {
        icouponService.deleteById(id);
    }

    @PutMapping("/put/{id}")
    Optional<Coupons> update (@PathVariable/*("id")*/ Long id, @RequestBody Coupons coupons )
    {
        return icouponService.update(id,coupons);
    }
}
