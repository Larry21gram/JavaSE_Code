package com.exception;

public class SimplePassworldException extends Exception {
    @Override
    public String getMessage() {
        return "密码过于简单";
    }
}
