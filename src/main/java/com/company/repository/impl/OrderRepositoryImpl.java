package com.company.repository.impl;

import com.company.entity.Order;
import com.company.repository.OrderRepository;

public class OrderRepositoryImpl implements OrderRepository {

    private Order [] orders;

    public OrderRepositoryImpl(Order [] orders) {
        this.orders = orders;
    }

    @Override
    public Order findByOrderId(Long orderId){
        for (Order order: orders) {
            if (order.getOrderId().equals(orderId)){
                return order;
            }
        }
        return null;
    }

    @Override
    public Order findByUserId(Long userId){
        for (Order order: orders) {
            if (order.getUser().getUserId().equals(userId)){
                return order;
            }
        }
        return null;
    }


}
