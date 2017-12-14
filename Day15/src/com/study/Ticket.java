package com.study;

public class Ticket {

    public  void sellTicket(){
        synchronized (Ticket.class){
            for (int i = 0; i < 10; i++) {
                try {
                    //一旦锁定对象调用wait方法，当前运行线程就失去了执行权
                    // 当锁定对象的notify方法执行时，才可以继续执行。
                    Ticket.class.wait();
                    System.out.println("暂停第" + i + "次");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public  void continued(){
        synchronized (Ticket.class) {
            Ticket.class.notifyAll();
        }
    }
}
