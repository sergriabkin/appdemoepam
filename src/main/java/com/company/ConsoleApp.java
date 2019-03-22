package com.company;

import com.company.entity.Item;
import com.company.entity.Order;
import com.company.entity.User;

public class ConsoleApp {
    private static final int ITEM_NUMBER = 5;
    public static final int USER_NUMBER = 5;
    public static final int ORDER_NUMBER = 3;

    public static void main(String[] args) {

        Item [] items = new Item[ITEM_NUMBER];
        items[0] = new Item(11L, "Shirt-S", 10000);
        items[1] = new Item(20L, "Shirt-M", 10500);
        items[2] = new Item(21L, "Shirt-L", 12000);
        items[3] = new Item(41L, "Shirt-XL", 13000);
        items[4] = new Item(42L, "Shirt-XXL", 13500);

        User [] users = new User[USER_NUMBER];
        users[0] = new User(1L, "alex@gmail.com", "1111");
        users[1] = new User(2L, "oleg@gmail.com", "222");
        users[2] = new User(3L, "boris@gmail.com", "33311");
        users[3] = new User(5L, "anna@gmail.com", "4444");
        users[4] = new User(4L, "ian@gmail.com", "5555");

        Order [] orders = new Order[ORDER_NUMBER];
        orders[0] = new Order(1L, null, null);

    }
}
