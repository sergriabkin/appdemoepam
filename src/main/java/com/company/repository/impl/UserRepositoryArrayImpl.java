package com.company.repository.impl;

import com.company.entity.user.User;
import com.company.repository.UserRepository;

@Deprecated
public class UserRepositoryArrayImpl implements UserRepository {

    private User [] users;

    public UserRepositoryArrayImpl(User [] users) {
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
