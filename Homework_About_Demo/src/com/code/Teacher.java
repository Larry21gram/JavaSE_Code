package com.code;

public class Teacher extends Person implements UserInter {
    public Teacher(String name, String user, String passworld, String job) {
        super(name, user, passworld, job);
    }

    public Teacher() {
    }

    @Override
    public void onLine() {
        System.out.println("老师上课了！");

    }

    @Override
    public void offLine() {
        System.out.println("老师下课了！");
    }
}
