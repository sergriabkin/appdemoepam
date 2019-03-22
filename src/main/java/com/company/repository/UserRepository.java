package com.company.repository;

import com.company.entity.User;

public class UserRepository {

    private User [] users;

    public UserRepository(User [] users) {
        this.users = users;
    }


    //find by id
    public User findByUserId(Long userId){
        for (User user : users){
            if (user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    //find by email
    public User findByUserEmail(String email){
        for (User user : users){
            if (user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }
}
