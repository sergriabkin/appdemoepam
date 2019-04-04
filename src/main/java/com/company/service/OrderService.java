package com.company.service;

import com.company.entity.Order;

public interface OrderService {

    Order findByOrderId(Long orderId);

    Order findByUserId(Long userId);
}
