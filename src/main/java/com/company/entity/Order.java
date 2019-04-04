package com.company.entity;

import com.company.entity.user.User;

public class Order {

    private final Long orderId;
    private final Item item;
    private final User user;

    public Order(Long orderId, Item item, User user) {
        this.orderId = orderId;
        this.item = item;
        this.user = user;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Item getItem() {
        return item;
    }

    public User getUser() {
        return user;
    }

}
