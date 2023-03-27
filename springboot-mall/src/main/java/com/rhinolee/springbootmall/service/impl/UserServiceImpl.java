package com.rhinolee.springbootmall.service.impl;

import com.rhinolee.springbootmall.dao.UserDao;
import com.rhinolee.springbootmall.dto.UserRegisterRequest;
import com.rhinolee.springbootmall.model.User;
import com.rhinolee.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
