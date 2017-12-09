package com.code;

public class Boss extends Person implements UserInter {
    public Boss(String name, String user, String passworld, String job) {
        super(name, user, passworld, job);
    }

    public Boss() {
    }

    @Override
    public void onLine() {
        System.out.println("老板出差了！");
    }

    @Override
    public void offLine() {
        System.out.println("老板度假去了！");
    }
}
