package com.aboutThread.study;

public class Main {
    protected static Thread thread = null;
    public static void main(String[] args) {
        /**
         *
         * 进程：
         * 任务管理器中的 .exe 文件的每一个叫程序，而这就叫进程。
         * 进程可以多线程。
         *
         * 线程：进程中的一个一个小程序。即程序执行单元。
         *
         * 正常情况下，每个线程都有自己的执行流程 ，互不干扰。
         * 如果人为写的话，可以使其产生交集。
         *
         *
         */
        //创建线程方式一：线程类
//        thread = new HolleThread();

        //创建线程方式二：创建Runnable实现类对象
        thread = new Thread(new HelloRunnable());

            /**
             * 内部类： 定义在类中的类。
             * 没有名字的对象叫匿名对象
             * 没有名字的内部类叫匿名内部类。
             *
             */
        //创建线程方式三： 内部类。
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=5000 ; i++) {
                    System.out.println("我是匿名内部类的run" + i);
                }
            }
        });

        //方式四：直接Thread的内部类。
        thread = new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };

        /**
         * start方法才是开启一个真正的线程。
         * thread.run（） 只是调用了某个对象的方法。并没有开始线程。
         */
        //只是调用方法，
        thread.run();

     /*   for (int i = 0; i <= 10000; i++) {
            *//**
             * Thread 类静态方法currentThread().getName() 帮助获得当前线程对象名
             *//*
            System.out.println(Thread.currentThread().getName()+ "Main  ---" + i);
        }*/

        // 开启一个线程
//        thread.start();

        /***
         * 什么四GC？
         * GC是Java中的垃圾回收机制
         * Java内存创建对象，程序员不能手动销毁。
         * 所以需要GC
         *
         * GC就是帮助我们把内存中不用的对象销毁，释放内存。
         *
         * 当Main方法执行时，实际启用了两个线程。其中一个是GC线程。
         * zhu:、GC销毁对象由GC决定。
         *
         */

        /**
         *
         * 线程的抢占式执行，
         *
         * 多个线程共同争抢CPU，谁先抢到谁执行。
         */

        for (int i = 0; i < 10000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + ".");
        }
    }
}
