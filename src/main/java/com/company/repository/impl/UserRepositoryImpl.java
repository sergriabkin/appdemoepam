package com.company.repository.impl;

import com.company.entity.user.User;
import com.company.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    private User [] users;

    public UserRepositoryImpl(User [] users) {
        this.users = users;
    }


    //find by id
    @Override
    public User findByUserId(Long userId){
        for (User user : users){
            if (user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    //find by email
    @Override
    public User findByUserEmail(String email){
        for (User user : users){
            if (user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }
}
