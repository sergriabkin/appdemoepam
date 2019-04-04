package com.company.service;

import com.company.entity.user.User;

public interface UserService {

    User findUserById(Long userId);

    User findUserByEmail(String email);

    boolean login(String email, String password);
}
