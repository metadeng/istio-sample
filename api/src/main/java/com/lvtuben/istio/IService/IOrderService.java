package com.lvtuben.istio.IService;

import com.lvtuben.istio.domain.OrderVo;

import java.util.Map;

/**
 * @author: Meta、Deng
 * @create: 2020-03-28
 **/
public interface IOrderService {
    /**
     * 获取订单信息
     *
     * @param id
     * @return
     */
    OrderVo getOrderById(String id);

    /**
     * 获取版本
     *
     * @return
     */
    Map<String, Object> version();
}
