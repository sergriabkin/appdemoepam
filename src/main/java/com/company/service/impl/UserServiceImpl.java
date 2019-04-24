package com.company.service.impl;

import com.company.entity.user.User;
import com.company.exception.EmailNotValidException;
import com.company.repository.UserRepository;
import com.company.service.UserService;
import com.company.util.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public User save(User user) {
        if (user != null){
            userRepository.save(user);
        }
        return user;
    }

    @Override
    public boolean login (String email, String password){
//        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
//
//        Pattern p2 = Pattern.compile(regex);
//        Matcher m2 = p2.matcher(email);
//
//        boolean matches = m2.matches();
//
        if (!Validator.isEmailVaild(email)) {
            System.out.println("invalid email");
            return false;
        }

        User user = userRepository.findByUserEmail(email);
        return user == null ? false : user.getPassword().equals(password);
    }

    @Override
    public User create(User user) {
        if (!Validator.isEmailVaild(user.getEmail())){
            throw new EmailNotValidException();
        }



        return userRepository.create(user);
    }

}
