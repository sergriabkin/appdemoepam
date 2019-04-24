package com.company.repository;

import com.company.entity.user.User;

public interface UserRepository {
     User findByUserId(Long userId);

     default User create(User user){
          throw new UnsupportedOperationException();
     }

     void save(User user);
     User findByUserEmail(String email);
}
