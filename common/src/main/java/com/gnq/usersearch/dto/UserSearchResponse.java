package com.gnq.usersearch.dto;

import java.io.Serializable;

/**
 * @author guonanqing
 * @version 1.0
 * @desc
 * @date 2020/12/4 11:07
 */
public class UserSearchResponse<T> implements Serializable {

    private static final long serialVersionUID = -1488249148655890886L;

    private int code;
    private String message;
    private T result;

    public UserSearchResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public UserSearchResponse code(int code){
        this.code = code;
        return this;
    }

    public UserSearchResponse message(String message){
        this.message = message;
        return this;
    }

    public UserSearchResponse result(T result){
        this.result = result;
        return this;
    }
}
