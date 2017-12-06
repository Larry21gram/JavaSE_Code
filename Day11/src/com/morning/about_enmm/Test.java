package com.morning.about_enmm;

import com.morning.com.morning.about_Map.Rice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        // first();
         //second();

        List<Rice> rice = new ArrayList();
        rice.add(new Rice("盘锦大米"));

        List<Rice> rice2 = new ArrayList<>();
        rice2.add(new Rice("热干面"));

        Map<String ,List<Rice>> map = new HashMap<>();
        map.put("一号：",rice);
        map.put("二号",rice2);
        for (String s:
             map.keySet()) {
            List<Rice> rices = map.get(s);
            for (int i = 0; i < rices.size(); i++) {
                System.out.println(rices.get(i));
            }
        }

        //third();
    }

    public static void third() {
        List<Rice> rice = new ArrayList();
        rice.add(new Rice("盘锦大米"));

        List<Rice> rice2 = new ArrayList<>();
        rice2.add(new Rice("热干面"));

        List<List<Rice>>  bigRice = new ArrayList<>();
        bigRice.add(rice);
        bigRice.add(rice2);
        // 外层集合
        for (int i = 0; i < bigRice.size(); i++) {
            //内层集合
            for (int j = 0; j < bigRice.get(i).size(); j++) {
                System.out.print( bigRice.get(i).get(j)+ " ");
            }
        }
    }

    public static void second() {

        Map<String,Student> map = new HashMap<>();
        map.put("zhangSan",new Student());
        Student zhangSan = map.get("zhangSan");
        System.out.println(zhangSan.toString());
    }

    public static void first() {
        /**
         * 泛型：
         */
        //<String> 表示list这个集合里只装String类型数据.
        List<String> list = new ArrayList<>();
        list.add("LiSi");
        list.add("zhangSan");
        //增强for循环不可改变集合中的元素
        for (String s : list) {
            s = "WangWu";
            System.out.println(s);
        }
        for (String s : list) {
            System.out.println(s);
        }

    }
}
