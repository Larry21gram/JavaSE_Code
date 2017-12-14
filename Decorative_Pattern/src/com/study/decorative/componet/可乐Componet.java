package com.study.decorative.componet;

public class 可乐Componet  extends 饮品{

    String name ;
    public 可乐Componet() {
        name  = "可乐";
    }

    @Override
    public int price() {
        return 80;
    }

    @Override
    public String getName() {
        return name;
    }
}
