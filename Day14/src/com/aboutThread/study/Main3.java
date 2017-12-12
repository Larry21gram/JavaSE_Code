package com.aboutThread.study;

public class Main3 {

    private static int num;

    public static void main(String[] args) {
        num = 100000;

        /**
         * 原子性操作？
         * 寄存器概念
         *
         * int a = 1 ; 、、 是原子性操作
         * int b = a + 1 ; 、、 不是原子性操作。 第一步： 找到a  第二步： a 的值与 1 相加的和  ，第三步： 和赋给 b
         *
         * 原子性操作即为一步到位的操作。
         */
        startOneThread();
        System.out.println("第一个完毕");
        startOneThread();
        System.out.println("第二个完毕");
        startOneThread();
        System.out.println("第三个完毕");
        startOneThread();
        System.out.println("第四个完毕");

    }

    private static void startOneThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 25000 ; i++) {
                    System.out.println(--num);
                }
            }
        }).start();
    }
}
