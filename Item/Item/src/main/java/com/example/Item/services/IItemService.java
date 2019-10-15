package com.example.Item.services;

import com.example.Item.domain.Item;
import com.example.Item.domain.common.ItemStatus;

import java.util.Optional;

public interface IItemService {

    Item save(Item items);
    Optional<Item> getById (Long id);
    void deleteById(Long id);
    Optional<Item> update(Long id, Item item);
    //ItemStatus activeitems (Long id);
    String findByItemId(String item_id);
}
