package com.gnq.usersearch.service.impl;

import com.gnq.usersearch.dto.UserSearchResponse;
import com.gnq.usersearch.entities.User;
import com.gnq.usersearch.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guonanqing
 * @version 1.0
 * @desc
 * @date 2020/12/4 16:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserSearchResponse<List<User>> getAllUsers() {
        List<User> users = new ArrayList<>();
        User user = new User();
        user.setId(1L);
        user.setUsername("test");
        users.add(user);
        return new UserSearchResponse<List<User>>().code(0).message("success").result(users);
    }
}
