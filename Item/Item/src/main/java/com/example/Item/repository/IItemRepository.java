package com.example.Item.repository;

import com.example.Item.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

//import java.util.Collection;


public interface IItemRepository extends JpaRepository<Item, Long> {

//@Query( "SELECT * FROM items where item_id=1 and status = 2" )
//    List<Item> activeitems ( String item_id, String status);

Item findItemByItemId(String item_id);

}
