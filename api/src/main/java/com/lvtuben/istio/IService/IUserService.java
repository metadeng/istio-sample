package com.lvtuben.istio.IService;

import com.lvtuben.istio.domain.UserVo;

import java.util.List;
import java.util.Map;

public interface IUserService {
    /**
     * 获取用户信息
     *
     * @param id
     * @return
     */
    UserVo getUserById(String id);

    /**
     * 获取所有用户
     *
     * @return
     */
    List<UserVo> getAllUser();

    /**
     * 获取版本
     *
     * @return
     */
    Map<String, Object> version();
}
