package com.after.exception;

public class EatTooMuchException extends  EatException {
    @Override
    public String getMessage() {
        return "不知不觉，吃撑了。";
    }
}
