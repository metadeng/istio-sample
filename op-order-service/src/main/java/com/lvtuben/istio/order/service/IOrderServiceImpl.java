package com.lvtuben.istio.order.service;

import com.lvtuben.istio.IService.IOrderService;
import com.lvtuben.istio.domain.OrderDetailVo;
import com.lvtuben.istio.domain.OrderVo;
import com.lvtuben.istio.order.dao.OrderDAO;
import com.lvtuben.istio.order.dao.OrderDetailDAO;
import com.lvtuben.istio.order.mapper.OrderDAOMapper;
import com.lvtuben.istio.order.mapper.OrderDetailDAOMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: Meta、Deng
 * @create: 2020-03-28
 **/
@Service
public class IOrderServiceImpl implements IOrderService {
    @Autowired
    private OrderDAOMapper orderDAOMapper;

    @Autowired
    private OrderDetailDAOMapper orderDetailDAOMapper;

    @Override
    public OrderVo getOrderById(String id) {
        OrderDAO orderDAO = orderDAOMapper.getOrderById(id);
        if (orderDAO == null) {
            return new OrderVo();
        }
        List<OrderDetailDAO> orderDetailDAOList = orderDAO.getOrderDetailDAOList();
        List<OrderDetailVo> orderDetailVoList = new ArrayList<>();

        if (orderDetailDAOList != null) {
            orderDetailDAOList.stream().forEach(x -> {
                orderDetailVoList.add(new OrderDetailVo(x.getId(), x.getbId(), x.getNum()));
            });
        }
        OrderVo orderVo = new OrderVo(orderDAO.getId(), orderDAO.getuId(), orderDAO.getCost(), orderDAO.getNum(), orderDAO.getCreateTime(), orderDAO.getUpdateTime(), orderDAO.getStatus(), orderDetailVoList);

        return orderVo;
    }

    @Override
    public Map<String, Object> version() {
        Date date = new Date();
        Info.Builder builder = new Info.Builder();
        builder.withDetail("version", "v1").withDetail("time", date.getTime()).withDetail("service", "op-order");
        return builder.build().getDetails();
    }
}
