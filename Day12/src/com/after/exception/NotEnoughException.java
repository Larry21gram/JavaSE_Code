package com.after.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

public class NotEnoughException extends EatException{
    /**
     * 自定义异常 ：自定义异常类。
     */
    @Override
    public String getMessage() {
        return "我是真的没吃饱，我还要。";
    }

}
