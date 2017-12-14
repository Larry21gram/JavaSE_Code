package com.except;

public class UserAlreadyExistedException extends Throwable {
    @Override
    public String getMessage() {
        return "用户名已存在";
    }
}
