package com.example.Item.controller;


import com.example.Item.domain.Item;
import com.example.Item.domain.common.ItemStatus;
import com.example.Item.services.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    @Autowired
    IItemService iItemService;

//    @Autowired
//    ObjectMapper objectMapper;

    @GetMapping("/get/{id}")
    Item getById(@PathVariable("id") Long id) {
        System.out.println("controller");

       // ResponseEntity<?> responseEntity=new ResponseEntity<>(null,null,HttpStatus.NOT_FOUND);
      return iItemService.getById(id).get();
////        objectMapper.convertValue(item, Item.class);
//        return objectMapper.convertValue(item.get(), Item.class);

    }

    @PostMapping("/save")
    Item save(@RequestBody Item item)
    {
        return iItemService.save(item);
    }

    @DeleteMapping("delete/{id}")
    void deleteById(@PathVariable("id") Long id)
    {
        iItemService.deleteById(id);
    }

    @PutMapping("/put/{id}")
       Optional<Item> update (@PathVariable/*("id")*/ Long id, @RequestBody Item item )
    {
        return iItemService.update(id,item);
    }

    @GetMapping("/itemstatus/{id}")
    Object activeitems(@PathVariable("id") String item_id )
    {
        return iItemService.findByItemId(item_id);
    }
}


