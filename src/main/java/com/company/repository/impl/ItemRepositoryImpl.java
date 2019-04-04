package com.company.repository.impl;

import com.company.entity.Item;
import com.company.repository.ItemRepository;

public class ItemRepositoryImpl implements ItemRepository {


    private Item[] items;

    public ItemRepositoryImpl(Item[] items) {
        this.items = items;

    }

    //TODO: CRUD

    // find by id -> return Item or null

    //Read
    //select * from items where itemId=?
    @Override
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
