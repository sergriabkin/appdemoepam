package com.company.ui;

import com.company.entity.User;
import com.company.service.UserService;

import java.util.Scanner;

public class ConsoleUI {
    private UserService userService;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleUI(UserService userService) {
        this.userService = userService;
    }

    public void run(){
        boolean isLogin = false;
        String email = null;

        while (!isLogin){
            System.out.println("Please input your email and password");
            email = scanner.next();
            String password = scanner.next();

            isLogin = userService.login(email, password);
        }


        User user = userService.findUserByEmail(email);
        System.out.println(user);

    }

}
