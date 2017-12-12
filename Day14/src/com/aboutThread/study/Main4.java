package com.aboutThread.study;

import com.aboutThread.study.synchronize.TicketDemo;

public class Main4 {
    public static void main(String[] args) {
        /**
         * synchronized
         * 同步：如果你先开始了，那等你干完了我再开始。
         * 异步：互不干扰，你干你的，我做我的。
         *
         */

        TicketDemo ticketDemo = new TicketDemo();
        startSell(ticketDemo);
        startSell(ticketDemo);
        startSell(ticketDemo);
        startSell(ticketDemo);

    }

    private static void startSell(TicketDemo ticketDemo) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                /**
                 * 在这个线程中，调用sellTicket 方法
                 * 我们说这个现象为：
                 * 线程进入了这个sellTicket方法。
                 *
                 * 因为有synchronize　修饰
                 * 所以只有一个线程在运行完时，才有另一个线程运行
                 */
                ticketDemo.sellTicket();
            }
        }).start();
    }
}
