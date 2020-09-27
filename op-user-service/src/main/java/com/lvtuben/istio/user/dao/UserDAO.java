package com.lvtuben.istio.user.dao;

/**
 * user dao
 */
public class UserDAO {
    private String id;
    private String userName;
    private String address;
    private String phone;
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDAO(String id, String userName, String address, String phone, String password) {
        this.id = id;
        this.userName = userName;
        this.address = address;
        this.phone = phone;
        this.password = password;
    }
}
