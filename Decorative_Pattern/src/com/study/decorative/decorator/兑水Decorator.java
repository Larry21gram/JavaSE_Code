package com.study.decorative.decorator;

import com.study.decorative.componet.饮品;

public class 兑水Decorator extends  Decorator {
    @Override
    public int price() {
        return yp.price() - 5;
    }

    public 兑水Decorator(饮品 yp) {
        super(yp);
    }

    @Override
    public String getName() {
        return "兑水的：" + yp.getName();
    }
}
