package com.lvtuben.istio.user.service.impl;

import com.lvtuben.istio.user.dao.UserDAO;
import com.lvtuben.istio.user.mapper.UserMapper;
import com.lvtuben.istio.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Meta、Deng
 * @create: 2020-03-28
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDAO getUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<UserDAO> getAllUser() {
        return userMapper.getAllUser();
    }
}
