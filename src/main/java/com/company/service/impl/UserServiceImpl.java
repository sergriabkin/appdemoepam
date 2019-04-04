package com.company.service.impl;

import com.company.entity.user.User;
import com.company.repository.UserRepository;
import com.company.service.UserService;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(Long userId){
        return userRepository.findByUserId(userId);
    }

    @Override
    public User findUserByEmail(String email){
        return userRepository.findByUserEmail(email);
    }

    @Override
    public boolean login (String email, String password){
        User user = userRepository.findByUserEmail(email);
        return user == null ? false : user.getPassword().equals(password);
    }

}
