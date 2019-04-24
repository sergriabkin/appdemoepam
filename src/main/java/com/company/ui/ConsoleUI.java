package com.company.ui;

import com.company.entity.user.Admin;
import com.company.entity.user.User;
import com.company.entity.user.UserType;
import com.company.service.UserService;
import com.company.util.Validator;

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
            System.out.println("1-Login / 2-Create acc");
            int choose = scanner.nextInt();

            System.out.println("Please input your email");
            email = scanner.next();
//            Validator.validateEmail(email);

            System.out.println("Please input your password");
            String password = scanner.next();

            isLogin = choose == 1 ? userService.login(email, password) :
                    userService.create(new User(100L, email, password) ) != null;


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
