package com.example.Item.controller;


import com.example.Item.domain.Brands;
import com.example.Item.domain.Item;
import com.example.Item.services.IBrandsService;
import com.example.Item.services.IItemService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/brand")
public class BrandController {

    @Autowired
    //IItemService iItemService;
    IBrandsService iBrandsService;

    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("/get/{id}")
    Brands getById(@PathVariable("id") Long id) {
        Optional<Brands> brands = iBrandsService.getById(id);
//        objectMapper.convertValue(item, Item.class);
        return objectMapper.convertValue(brands.get(), Brands.class);
    }

    @PostMapping("/save")
    Brands save(@RequestBody Brands brands) {
        return iBrandsService.save(brands);
    }


    @DeleteMapping("/delete/{id}")
    void deleteById(@PathVariable("id") Long id)
    {
        iBrandsService.deleteById(id);
    }

    @PutMapping("/put/{id}")
    Optional<Brands> update (@PathVariable/*("id")*/ Long id, @RequestBody Brands brands )
    {
        return iBrandsService.update(id,brands);
    }

}
