package com.jdbc;

public class About_Static {
     public About_Static() {
         System.out.println("我是构造方法。");
     }

    {
        System.out.println("我是构造块");
    }

    static {
        System.out.println("我是静态块");
    }
}
