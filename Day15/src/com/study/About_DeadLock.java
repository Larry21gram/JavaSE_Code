package com.study;

public class About_DeadLock {
    public static void main(String[] args) {
        /**
         * 死锁
         * A线程和B线程在运行时需要lockA和lockB，但是顺序相反。
         * 但是A线程在拿到lockA时，lockB被B线程拿到了，因此成了死锁。
         *
         * 输出效果：
         *   A 线程准备开启 持有lockA
             A线程已经持有lockA 准备持有lockB
             B 线程准备开启 持有lockB
             B线程已经持有lockB 准备持有lockA
         */
        DeadLock d = new DeadLock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                d.forThreadA();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                d.forThreadB();
            }
        }).start();
    }
}
