package com.code;
public class Doctor extends Person implements UserInter {
    @Override
    public void onLine() {
        System.out.println("医生上班了！");
    }

    @Override
    public void offLine() {
        System.out.println("医生下班了！");
    }

    public Doctor(String name, String user, String passworld, String job) {
        super(name, user, passworld, job);
    }

    public Doctor() {
    }
}
