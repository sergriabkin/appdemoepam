package com.company.service.impl;

import com.company.entity.Item;
import com.company.repository.ItemRepository;
import com.company.service.ItemService;

public class ItemServiceImpl implements ItemService {
    private ItemRepository itemRepository;

    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item findByItemId(Long itemId) {
        return itemRepository.findByItemId(itemId);
    }
}
