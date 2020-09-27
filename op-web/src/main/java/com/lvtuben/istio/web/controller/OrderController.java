package com.lvtuben.istio.web.controller;

import com.lvtuben.istio.IService.IOrderService;
import com.lvtuben.istio.domain.OrderVo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author: Meta、Deng
 * @create: 2020-03-29
 **/
@RestController
@RequestMapping("order")
@CrossOrigin
public class OrderController {
    @Reference
    private IOrderService iOrderService;

    @GetMapping("/getOrderById/{id}")
    public OrderVo getOrderById(@PathVariable("id") String id) {
        OrderVo orderVo = iOrderService.getOrderById(id);
        return orderVo;
    }

    @GetMapping("/version")
    public Map<String, Object> version() {
        return iOrderService.version();
    }
}
