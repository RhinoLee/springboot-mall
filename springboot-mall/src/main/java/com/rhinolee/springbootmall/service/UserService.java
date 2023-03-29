package com.rhinolee.springbootmall.service;

import com.rhinolee.springbootmall.dto.UserLoginRequest;
import com.rhinolee.springbootmall.dto.UserRegisterRequest;
import com.rhinolee.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);

}
