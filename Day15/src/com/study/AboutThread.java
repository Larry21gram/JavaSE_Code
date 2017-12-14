package com.study;

public class AboutThread {
    public static void main(String[] args) {

        Ticket t = new Ticket();
        TreadDemo ti = new TreadDemo( "测试" ,t);
        ti.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
               while (true){
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   new Ticket().continued();
               }
            }
        }).start();
    }
}
