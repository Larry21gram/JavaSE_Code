package com.morning.com.morning.about_Map;


import java.util.*;

public class About_Map {
    /**
    Map
    是什么？
    一个接口，可以存放数据，以键值对形式。（键值对： name : "zhangSan"）
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zhangSan");
        list.add("LiSi");
        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("以下是Map");
        Map m = new HashMap();

        // put 方法添加键值对。
        m.put("name","WangWu");
        m.put("年龄",20);
        m.put("gander","man");

        // get 方法获得键对应的值
//        System.out.println(m.get("name"));

        System.out.println("开始遍历了！！！");
        //方式一：快捷键 iter
        for (Object o : m.keySet()) {// foreach 增强for循环，“：”后面为集合
            // 依次取出集合中的Key给 o 。
            // 将Map中所有Key拿出来（m.keySet）
            System.out.println(m.get(o).toString());
        }
        // 获得Map中的所有键值对，  放进Set集合里。
        Set set = m.entrySet();
        /**
         * collection是接口
         * List 和 Set是他的子接口。
         * ArrayList只是实现类
         *
         * List有序 ，可重复。
         * Set无序，不可重复。
         */

        // 方式二：
        for (Object o : set) {
            /*
            一个Entry的实现类对象，表示一个键值对。
            可以使用这个类对象，获得Key和Value。
             */
            Map.Entry entry = (Map.Entry) o;
            System.out.println("Key的值为：" + entry.getKey()
                                + "\t value的值为：" + entry.getValue());
            //System.out.println(o.getClass());
        }

    }
}
