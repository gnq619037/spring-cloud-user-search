package com.gnq.usersearch.entities.user;

import java.io.Serializable;

/**
 * @author guonanqing
 * @version 1.0
 * @desc
 * @date 2020/12/4 16:41
 */
public class User implements Serializable {

    private static final long serialVersionUID = 7918206270286231631L;

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
