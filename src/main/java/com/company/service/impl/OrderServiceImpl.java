package com.company.service.impl;

import com.company.entity.Order;
import com.company.repository.OrderRepository;
import com.company.service.OrderService;

public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findByOrderId(Long orderId) {
        return orderRepository.findByOrderId(orderId);
    }

    @Override
    public Order findByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }

}
