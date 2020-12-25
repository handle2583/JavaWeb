package com.jason.wj.result;

import com.jason.wj.entity.User;

public class ResultFactory {
    public static Result buildFailResult(String message) {
        Result result = new Result(400, message);
        return result;
    }


    public static Result buildSuccessResult(String message) {
        Result result = new Result(200, message);
        return result;
    }

    public static Result buildSuccessResult(User user) {
        Result result = new Result(200, user);
        return result;
    }
}
