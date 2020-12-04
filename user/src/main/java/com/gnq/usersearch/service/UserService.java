package com.gnq.usersearch.service;

import com.gnq.usersearch.dto.UserSearchResponse;
import com.gnq.usersearch.entities.User;

import java.util.List;

/**
 * @author guonanqing
 * @version 1.0
 * @desc 用户接口
 * @date 2020/12/4 16:29
 */
public interface UserService {
    /**
     * 获取所有用户
     * @return
     */
    public UserSearchResponse<List<User>> getAllUsers();
}
