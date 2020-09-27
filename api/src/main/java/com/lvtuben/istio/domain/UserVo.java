package com.lvtuben.istio.domain;

import java.io.Serializable;

/**
 * user vo
 */
public class UserVo implements Serializable {
    private String id;
    private String userName;
    private String address;
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public UserVo(String id, String userName, String address, String phone) {
        this.id = id;
        this.userName = userName;
        this.address = address;
        this.phone = phone;
    }

    public UserVo() {
    }
}
