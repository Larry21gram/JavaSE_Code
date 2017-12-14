package com.after;

import com.after.exception.EatException;
import com.after.exception.EatTooMuchException;
import com.after.exception.NotEnoughException;

public class Test {
    public static void main(String[] args) {
        /**
         * 异常：
         *
         * 处理异常为使用try-catch
         *try｛
         *      可能出现异常的代码块，如果异常则转为catch块中
         *
         * ｝catch （异常类型 异常）｛
         *      发生异常是执行的代码块。
         * ｝finally{
         *     // 在finally中是一定要执行的代码块，不管是否报错。即使方法return了 也会执行。
         * }
         *
         * throw ： 方法内部抛出异常对象使用
         * throws : 方法声明时，声明抛出异常类型。
         *
         *
         */
        int num = 10 ;

        // 简易版异常
//        showSimple(num);

        // 处理异常为使用try-catch ;自定义
//        second();

        //
            ChunLaii chunLaii = null;
        try {
            chunLaii = new ChunLaii();
            chunLaii.eat(250);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                chunLaii.eat(250);
            } catch (EatException e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void second() {
        /*try {
            new ChunLaii().eat(230);
        } catch (NotEnoughException e) {
            try {
                new ChunLaii().eat(250);
            } catch (NotEnoughException e1) {
                e1.printStackTrace();
            } catch (EatTooMuchException e1) {
                e1.printStackTrace();
            }
        } catch (EatTooMuchException e) {
            e.printStackTrace();
        }*/
    }

    public static void showSimple(int num) {
        try{
            int result = num/0 ;
        }catch (ArithmeticException e){
            System.out.println(e.getClass().getName());
            System.out.println(e.getClass().getSimpleName());

            return;// 跳出方法。
        }finally {
            System.out.println("hahahahahahah....");
        }
    }
}
