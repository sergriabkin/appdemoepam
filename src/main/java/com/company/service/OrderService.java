package com.company.service;

import com.company.entity.Order;
import com.company.repository.OrderRepository;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order findByOrderId(Long orderId) {
        return orderRepository.findByOrderId(orderId);
    }

    public Order findByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }
}
