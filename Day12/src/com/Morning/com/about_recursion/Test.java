package com.Morning.com.about_recursion;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public  static  <T> T getInstance(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        // 使用类对象tclass，创建对象。
        // 类对象执行了T 泛型
        // 意味着创建出来的对象类型为 T 类型
        // 编译器不稳定，返回值为Object
        T t = tClass.newInstance();
        return tClass.newInstance();
    }
    public static Object getInstance(String className) throws Exception{

        // 只需要使用字符串形式类名，即可获得类对象。
        Class<?> aClass = Class.forName(className);
        System.out.println("类名：" + aClass.getName());

        // 通过类对象，获得给类型对象。
        Object o = aClass.newInstance();
        System.out.println("对象：" + o.toString());

        //通过方法获得该对象属性。
        Field name = aClass.getDeclaredField("name");
        System.out.println("属性：" + name);

        //参数1 ： 方法名
//        参数2 ：参数链表中每个参数类型，任意参数
        Method show = aClass.getDeclaredMethod("show", String.class);
        show.invoke(o,"fishing");
        System.out.println("方法：" + show);

        //打破私有权限限制。
        name.setAccessible(true);

        //使用name属性的set方法给name赋值，参数1 ： 对象，   canshu2 :值
        name.set(o,"GaiLun");

        return o;
    }
}
