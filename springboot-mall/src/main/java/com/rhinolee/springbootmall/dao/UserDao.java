package com.rhinolee.springbootmall.dao;

import com.rhinolee.springbootmall.dto.UserRegisterRequest;
import com.rhinolee.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserByEmail(String email);

}
