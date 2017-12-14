package com.study.decorative.decorator;

import com.study.decorative.componet.饮品;

public class Decorator extends 饮品 {

    public 饮品 yp ;

    public Decorator(饮品 yp) {
        this.yp = yp;
    }

    @Override
    public int price() {
        return 0;
    }

    @Override
    public String getName() {
        return this.yp.getName();
    }
}
