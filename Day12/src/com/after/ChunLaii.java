package com.after;

import com.after.exception.EatException;
import com.after.exception.EatTooMuchException;
import com.after.exception.NotEnoughException;

public class ChunLaii {

    //throw ： 方法内部抛出异常对象使用
    //throws : 方法声明时，声明抛出异常类型。

    // 声明抛出异常EatException ，其子类异常都可抛。
    public void eat(int weight) throws EatException {
        if (weight < 200){
            // 表示没吃饱,并抛出异常：没吃饱。
            throw new NotEnoughException();// 抛出异常对象。
        }
        if (weight > 300) {
            //吃撑了。
            throw new EatTooMuchException();
        }
    }
}
