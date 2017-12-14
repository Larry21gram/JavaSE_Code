package com.except;

public class NoPersonException extends Exception {
    @Override
    public String getMessage() {
        return "用户不存在！";
    }
}
