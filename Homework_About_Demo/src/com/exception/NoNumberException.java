package com.exception;

public class NoNumberException extends Exception {
    @Override
    public String getMessage() {
        return  "密码缺乏数字，过于简单。";
    }
}
