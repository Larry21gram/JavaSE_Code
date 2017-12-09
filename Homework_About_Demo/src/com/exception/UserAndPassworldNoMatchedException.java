package com.exception;

public class UserAndPassworldNoMatchedException extends Exception {
    @Override
    public String getMessage() {
        return "用户名与密码不匹配";
    }
}
