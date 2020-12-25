package com.jason.wj.result;

import com.jason.wj.entity.User;

public class Result {
    //响应码
    private int code;
    private String message ;
    private User user ;
    public Result(int code) {
        this.code = code;
    }
    public Result(int code , String message) {
        this.code = code;
        this.message = message ;
    }

    public Result(int code , User user) {
        this.code = code;
        this.user = user ;
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

}
