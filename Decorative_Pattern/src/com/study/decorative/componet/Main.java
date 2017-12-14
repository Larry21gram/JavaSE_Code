package com.study.decorative.componet;

import com.study.decorative.decorator.兑水Decorator;
import com.study.decorative.decorator.加醋Decorator;

public class Main {
    public static void main(String[] args) {
        饮品 c = new 可乐Componet();

        兑水Decorator d = new 兑水Decorator(c);

        System.out.println(d.getName() + "__" + d.price());

        加醋Decorator dd = new 加醋Decorator(c);

        System.out.println(dd.getName() + " -- " + dd.price());
    }
}
