package com.company.repository;

import com.company.entity.Order;

public class OrderRepository {

    private Order [] orders;

    public OrderRepository(Order [] orders) {
        this.orders = orders;
    }

    public Order findByOrderId(Long orderId){
        for (Order order: orders) {
            if (order.getOrderId().equals(orderId)){
                return order;
            }
        }
        return null;
    }

    public Order findByUserId(Long userId){
        for (Order order: orders) {
            if (order.getUser().getUserId().equals(userId)){
                return order;
            }
        }
        return null;
    }


}
