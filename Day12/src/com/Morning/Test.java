package com.Morning;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        Map m = new HashMap() ;
        m.put("name" , " zhang");
        m.put("gander" , " man");
        m.put("age" , " 22");

        //方法1
        Set keySet = m.keySet();
        for (Object o : keySet) {
            System.out.println("key " + o  + "value " + m.get(o));
        }

        // 2
        for (Object o : m.values()) {
            System.out.println(o);
        }

        //3
        Iterator<Map.Entry> iterator = m.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry next = iterator.next();
            System.out.println("Kye " + next.getKey() + "value " + next.getValue());
        }

        //4
        Set set1 = m.entrySet();
        for (Object o : set1) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println("key " + entry.getKey() + "value " + entry.getValue());
        }

    }
}
