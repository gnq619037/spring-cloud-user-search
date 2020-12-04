package com.gnq.usersearch.entities;

import java.io.Serializable;

/**
 * @author guonanqing
 * @version 1.0
 * @desc 用户类
 * @date 2020/12/4 16:30
 */
public class User implements Serializable {

    private static final long serialVersionUID = 4127788342118937556L;

    private Long id;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
