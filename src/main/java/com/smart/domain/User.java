package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private int userId;
    private String username;
    private String password;
    private int credits;
    private String lastIp;
    private Date lastVisit;

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getCredits() {
        return credits;
    }

    public String getLastIp() {
        return lastIp;
    }

    public Date getLastVisit() {
        return lastVisit;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }
}
