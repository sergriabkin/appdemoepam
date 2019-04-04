package com.company.repository;

import com.company.entity.Order;

public interface OrderRepository {

     Order findByOrderId(Long orderId);

     Order findByUserId(Long userId);
}
