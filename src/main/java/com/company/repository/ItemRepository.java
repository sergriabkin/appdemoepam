package com.company.repository;

import com.company.entity.Item;

public class ItemRepository {
    private static final int MAX_NUMBER = 5;

    private Item[] items;

    public ItemRepository(Item[] items) {
        this.items = new Item[MAX_NUMBER];
        items[0] = new Item(11L, "Shirt-S", 10000);
        items[1] = new Item(20L, "Shirt-M", 10500);
        items[2] = new Item(21L, "Shirt-L", 12000);
        items[3] = new Item(41L, "Shirt-XL", 13000);
        items[4] = new Item(42L, "Shirt-XXL", 13500);
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
