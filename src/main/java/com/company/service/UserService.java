package com.company.service;

import com.company.entity.User;
import com.company.repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long userId){
        return userRepository.findByUserId(userId);
    }
    public User findUserByEmail(String email){
        return userRepository.findByUserEmail(email);
    }

    public boolean login (String email, String password){
        User user = userRepository.findByUserEmail(email);
        return user == null ? false : user.getPassword().equals(password);
    }

}
