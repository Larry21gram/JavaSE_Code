package com.study;

public class TreadDemo extends Thread {

    private  Ticket ticket;

    public  TreadDemo(String name , Ticket ticket){
        super(name);
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticket.sellTicket();
    }

}
