package com.lvtuben.istio.web.service;

import java.util.Map;

/**
 * @author: Meta、Deng
 * @create: 2020-04-08
 **/
public interface WebService {
    /**
     * 获取版本
     *
     * @return
     */
    Map<String, Object> version();
}
