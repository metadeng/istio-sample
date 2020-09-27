package com.lvtuben.istio.domain;

import java.io.Serializable;

/**
 * order detail vo
 */
public class OrderDetailVo implements Serializable {
    private String id;
    private String bId;
    private Integer bookCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public OrderDetailVo(String id, String bId, Integer bookCount) {
        this.id = id;
        this.bId = bId;
        this.bookCount = bookCount;
    }
}
