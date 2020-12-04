package com.gnq.search.service;

import com.gnq.usersearch.dto.UserSearchResponse;
import com.gnq.usersearch.entities.user.User;

import java.util.List;

/**
 * @author guonanqing
 * @version 1.0
 * @desc
 * @date 2020/12/4 16:21
 */
public interface SearchService {
    public UserSearchResponse<List<User>> getSearchResult();
}
