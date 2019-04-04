package com.company.ui;

import com.company.entity.user.Admin;
import com.company.entity.user.User;
import com.company.entity.user.UserType;
import com.company.service.UserService;

import java.util.Scanner;

public class ConsoleUI {
    private UserService userService;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleUI(UserService userService) {
        this.userService = userService;
    }

    public void run() {
        boolean isLogin = false;
        String email = null;

        while (!isLogin) {
            System.out.println("Please input your email and password");
            email = scanner.next();
            String password = scanner.next();

            isLogin = userService.login(email, password);
        }

        User user = userService.findUserByEmail(email);

        UserType userType = user.getUserType();
        if (userType == UserType.ADMIN) {
            Admin admin = (Admin) user;
            System.out.println("Hello admin " + admin.getKey());
        }

//        Admin admin = (Admin) user;

        System.out.println(user);

    }

}
