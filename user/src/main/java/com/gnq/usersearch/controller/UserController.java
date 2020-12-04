package com.gnq.usersearch.controller;

import com.gnq.usersearch.dto.UserSearchResponse;
import com.gnq.usersearch.entities.User;
import com.gnq.usersearch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guonanqing
 * @version 1.0
 * @desc
 * @date 2020/12/4 11:03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public UserSearchResponse<String> userServiceTest(){
        return new UserSearchResponse<String>().code(0).message("user-service-test-success");
    }

    @GetMapping("/all")
    public UserSearchResponse<List<User>> getAllUsers(){
        System.out.println("[user-service]getAllUsers");
        return userService.getAllUsers();
    }
}
