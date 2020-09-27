package com.lvtuben.istio.order.mapper;

import com.lvtuben.istio.order.dao.OrderDetailDAO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailDAOMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderDetailDAO record);

    OrderDetailDAO selectByPrimaryKey(String id);

    int updateByPrimaryKey(OrderDetailDAO record);

}