package com.exception;

public class UserAlreadyExistedException extends Exception {
    @Override
    public String getMessage() {
        return "用户名已存在！";
    }
}
