package com.company.entity;

public class Order {

    private final Long orderId;
    private final Item[] items;
    private final User user;

    public Order(Long orderId, Item[] goods, User user) {
        this.orderId = orderId;
        this.items = goods;
        this.user = user;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Item[] getItems() {
        return items;
    }

    public User getUser() {
        return user;
    }

}
