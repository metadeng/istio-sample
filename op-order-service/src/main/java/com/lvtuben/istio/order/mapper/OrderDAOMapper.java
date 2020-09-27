package com.lvtuben.istio.order.mapper;

import com.lvtuben.istio.order.dao.OrderDAO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDAOMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderDAO record);

    OrderDAO selectByPrimaryKey(String id);

    int updateByPrimaryKey(OrderDAO record);

    OrderDAO getOrderById(String id);

}