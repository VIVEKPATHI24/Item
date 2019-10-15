package com.example.Item.services;
import com.example.Item.domain.Item;
import com.example.Item.domain.common.ItemStatus;
import com.example.Item.repository.IBrandRepository;
import com.example.Item.repository.IItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService implements IItemService {
    @Autowired
    IItemRepository iItemRepository;
    @Autowired
    IBrandRepository brandRepository;

    @Override
    public Item save(Item item)
    {
        Long brandId=item.getBrands().getId();
        if(brandRepository.existsById(brandId))
        {
            return iItemRepository.save(item);
        }
        else{
            return null;
        }
    }

    @Override
    public Optional<Item> getById(Long id)
    {
        System.out.println("service");
//        System.out.println(iItemRepository.findById(id));



        return iItemRepository.findById(id);
    }

    @Override
    public void deleteById(Long id)
    {
     iItemRepository.deleteById(id);
    }

    @Override
    public Optional<Item> update(Long id, Item item)
    {
        if(iItemRepository.existsById(id))
        {
            iItemRepository.save(item);
        }
        return null;
    }



    @Override
    public String findByItemId(String item_id) {

        Item item1 =iItemRepository.findItemByItemId(item_id);
     //   System.out.println(item1.getStatus());
        return item1.getStatus().toString();

    }
}
