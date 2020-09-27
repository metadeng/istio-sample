package com.lvtuben.istio.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * order vo
 */
public class OrderVo implements Serializable {
    private String id;
    private String consumerId;
    private BigDecimal cost;
    private Integer bookCount;
    private Date createTime;
    private Date updateTime;
    private Integer status;
    private List<OrderDetailVo> orderDetailVoList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(String consumerId) {
        this.consumerId = consumerId;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
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

    public List<OrderDetailVo> getOrderDetailVoList() {
        return orderDetailVoList;
    }

    public void setOrderDetailVoList(List<OrderDetailVo> orderDetailVoList) {
        this.orderDetailVoList = orderDetailVoList;
    }

    public OrderVo() {
    }

    public OrderVo(String id, String consumerId, BigDecimal cost, Integer bookCount, Date createTime, Date updateTime, Integer status, List<OrderDetailVo> orderDetailVoList) {
        this.id = id;
        this.consumerId = consumerId;
        this.cost = cost;
        this.bookCount = bookCount;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
        this.orderDetailVoList = orderDetailVoList;
    }
}
