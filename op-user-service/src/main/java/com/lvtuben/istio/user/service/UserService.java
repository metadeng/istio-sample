package com.lvtuben.istio.user.service;

import com.lvtuben.istio.user.dao.UserDAO;

import java.util.List;

/**
 * @author: Meta、Deng
 * @create: 2020-03-28
 **/
public interface UserService {
    UserDAO getUserById(String id);

    List<UserDAO> getAllUser();
}
