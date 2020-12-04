package com.gnq.search.service.impl;

import com.gnq.search.service.SearchService;
import com.gnq.usersearch.dto.UserSearchResponse;
import com.gnq.usersearch.entities.user.User;
import com.gnq.usersearch.user.service.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guonanqing
 * @version 1.0
 * @desc
 * @date 2020/12/4 16:22
 */
@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    UserServiceClient userServiceClient;

    @Override
    public UserSearchResponse<List<User>> getSearchResult() {
        UserSearchResponse<List<User>> userResponse = userServiceClient.getAllUsers();
        List<User> users = userResponse.getResult();
        System.out.println("获取users size:"+users.size());
        return userResponse;
    }
}
