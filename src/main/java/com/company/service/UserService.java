package com.company.service;

import com.company.entity.user.User;

public interface UserService {

    User findUserById(Long userId);

    User findUserByEmail(String email);

    User save(User user);

    boolean login(String email, String password);

    User create(User user);
}
