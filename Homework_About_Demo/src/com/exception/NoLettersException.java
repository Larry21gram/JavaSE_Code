package com.exception;

public class NoLettersException extends Exception {
    @Override
    public String getMessage() {
        return "密码没字母，过于简单。";
    }
}
