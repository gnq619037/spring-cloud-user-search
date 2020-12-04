package com.gnq.usersearch.user.service;

import com.gnq.usersearch.dto.UserSearchResponse;
import com.gnq.usersearch.entities.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author guonanqing
 * @version 1.0
 * @desc
 * @date 2020/12/4 16:27
 */
@FeignClient(name = "user-service", path = "/userCenter")
@RequestMapping("/user")
public interface UserServiceClient {

    @GetMapping("/all")
    public UserSearchResponse<List<User>> getAllUsers();
}
