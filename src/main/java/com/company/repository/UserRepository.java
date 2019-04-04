package com.company.repository;

import com.company.entity.user.User;

public interface UserRepository {
     User findByUserId(Long userId);
     User findByUserEmail(String email);
}
