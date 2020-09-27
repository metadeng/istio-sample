package com.lvtuben.istio.user.mapper;

import com.lvtuben.istio.user.dao.UserDAO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: Meta、Deng
 * @create: 2020-03-28
 **/
@Mapper
public interface UserMapper {
    UserDAO getUserById(String id);

    List<UserDAO> getAllUser();
}
