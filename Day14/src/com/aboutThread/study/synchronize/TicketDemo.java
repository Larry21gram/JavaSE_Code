package com.aboutThread.study.synchronize;

public class TicketDemo {

    private int ticket = 10000;

    /**.
     * synchronized
     * 锁
     * 锁是对象，并且是任意类型。
     * 作用： 给方法上一个锁。给方法上锁时，使用对象为当前类的类对象。
     * 现在是： TicketDome.class 对象。
     *
     * 当一个线程进入sellTicket方法时，
     * 该线程就会持有着个锁。
     * 其他线程就进不去
     * 这个现象叫同步。
     */
    public synchronized void  sellTicket(){
        for (int i = 0; i < 2500; i++) {
            System.out.println(Thread.currentThread().getName() +"剩余票数：" + (--ticket));
        }
    }
}
