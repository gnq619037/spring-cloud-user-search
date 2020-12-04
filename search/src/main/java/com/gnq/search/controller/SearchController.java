package com.gnq.search.controller;

import com.gnq.search.service.SearchService;
import com.gnq.usersearch.dto.UserSearchResponse;
import com.gnq.usersearch.entities.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guonanqing
 * @version 1.0
 * @desc
 * @date 2020/12/4 16:19
 */
@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/test")
    public UserSearchResponse<String> searchServiceTest(){
        return new UserSearchResponse<String>().code(0).message("search-service-test-success");
    }

    @GetMapping("/getResult")
    public UserSearchResponse<List<User>> getSearchResult(){
        return searchService.getSearchResult();
    }
}
