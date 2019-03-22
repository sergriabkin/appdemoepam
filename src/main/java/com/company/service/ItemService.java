package com.company.service;

import com.company.entity.Item;
import com.company.repository.ItemRepository;

public class ItemService {
    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item findByItemId(Long itemId) {
        return itemRepository.findByItemId(itemId);
    }
}
