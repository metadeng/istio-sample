package com.lvtuben.istio.order.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderDAO {
    private String id;

    private String uId;

    private BigDecimal cost;

    private Integer num;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    private List<OrderDetailDAO> orderDetailDAOList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<OrderDetailDAO> getOrderDetailDAOList() {
        return orderDetailDAOList;
    }

    public void setOrderDetailDAOList(List<OrderDetailDAO> orderDetailDAOList) {
        this.orderDetailDAOList = orderDetailDAOList;
    }
}