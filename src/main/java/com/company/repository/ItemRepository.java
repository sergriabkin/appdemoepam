package com.company.repository;

import com.company.entity.Item;

public class ItemRepository {


    private Item[] items;

    public ItemRepository(Item[] items) {
        this.items = items;

    }

    //TODO: CRUD

    // find by id -> return Item or null

    //Read
    //select * from items where itemId=?
    public Item findByItemId(Long itemId){
//        throw new UnsupportedOperationException(); - stub
        for (Item item : items ) {
            if (item.getItemId().equals(itemId)){
                return item;
            }
        }
        return null;
    }

}
