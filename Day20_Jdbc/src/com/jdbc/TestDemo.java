package com.jdbc;

public class TestDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = About_Static.class;
        /**
         * 静态代码块只加载一次，应为类只加载一次。
         * 而构造块则是随对象创建而加载。
         */
        About_Static a = new About_Static();

    }
}
