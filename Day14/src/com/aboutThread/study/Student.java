package com.aboutThread.study;

public class Student {
    private  String name ;
    public  void  show(){
        System.out.println("外部类方法！");
        new In().kan();
    }

    class In{
        public void kan(){
        System.out.println("内部类方法！");
        }
    }
}
