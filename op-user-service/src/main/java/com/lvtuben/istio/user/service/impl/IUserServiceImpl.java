package com.lvtuben.istio.user.service.impl;

import com.lvtuben.istio.IService.IUserService;
import com.lvtuben.istio.domain.UserVo;
import com.lvtuben.istio.user.dao.UserDAO;
import com.lvtuben.istio.user.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserVo getUserById(String id) {
        UserDAO userDAO = userMapper.getUserById(id);
        if (userDAO == null) {
            return new UserVo();
        }
        return new UserVo(userDAO.getId(), userDAO.getUserName(), userDAO.getAddress(), userDAO.getPhone());
    }

    @Override
    public List<UserVo> getAllUser() {
        List<UserDAO> userDAOList = userMapper.getAllUser();
        List<UserVo> userVoList = new ArrayList<>();
        if (userDAOList != null) {
            userDAOList.stream().forEach(x -> {
                userVoList.add(new UserVo(x.getId(), x.getUserName(), x.getAddress(), x.getPhone()));
            });
        }
        return userVoList;
    }

    @Override
    public Map<String, Object> version() {
        Date date = new Date();
        Info.Builder builder = new Info.Builder();
        builder.withDetail("version", "v2").withDetail("time", date.getTime()).withDetail("service", "op-user");
        return builder.build().getDetails();
    }
}
