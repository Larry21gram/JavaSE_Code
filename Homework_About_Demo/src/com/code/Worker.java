package com.code;

public class Worker extends Person implements UserInter{

    @Override
    public void onLine() {
        System.out.println("工人上班了！");
    }

    @Override
    public void offLine() {
        System.out.println("工人下班了!");
    }

    public Worker(String name, String user, String passworld, String job) {
        super(name, user, passworld, job);
    }

    public Worker() {
    }
}
