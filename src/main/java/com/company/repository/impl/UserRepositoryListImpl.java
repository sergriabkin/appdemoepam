package com.company.repository.impl;

import com.company.entity.user.User;
import com.company.repository.UserRepository;

import java.util.List;

public class UserRepositoryListImpl implements UserRepository {

    private List<User> users;

    public UserRepositoryListImpl(List<User> users) {
        this.users = users;
    }

    @Override
    public User findByUserId(Long userId) {
        for (User user : users){
            if (user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User create(User user) {
        users.add(user);
        return user;
    }

    @Override
    public void save(User user) {
        System.out.println("user was created in database");
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
