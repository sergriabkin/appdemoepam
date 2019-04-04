package com.company.repository;

import com.company.entity.Item;

public interface ItemRepository {
     Item findByItemId(Long itemId);
}
