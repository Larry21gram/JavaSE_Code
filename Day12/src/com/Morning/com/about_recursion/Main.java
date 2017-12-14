package com.Morning.com.about_recursion;

import com.Morning.one.Student;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    @Test
    // 刚添加的是Java测试包，使用@Test注解可以单独运行t1 方法
    public  void t1(){
        /**
         * 递归
         * 自己调用自己。
         */
        //show();
        practice(9);
    }

    int i = 0 ;
    public void show(){
        System.out.println("第" + ++i + "次调用");
        if (i < 9) {
            show();
        }
        System.out.println("第" + i + "次调用结束");
    }

    public  void  addList(int i ){

    }
    public void practice(int num){
        int key = 10 - num ;
        for (int j = 1; j <= key; j++) {
            System.out.print(j+ " * " + key + " = " + (j * key) + ";\t");
        }
        System.out.println();
        num -- ;
        if (num == 0){
            return ;
        }
        practice(num);
    }

    // 反射
    @Test
    public void t2 () throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        /**
         * 反射
         * 作用：给我一个类，可以在没有对象的情况下调用静态方法外的一切。解耦合。
         * Hero.class 为类对象。
         * instance : 实例。即对象
         *
         * 如果类无是空参构造？newInstance（） 是否可以获得对象。 可以
         */

        //Hero.class.getName(); 可以获得：com.Morning.com.about_recursion.Hero
        String name = Hero.class.getName();
        Hero hero = null;
        // 获得对象
        try {
            hero = Hero.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //获得方法
        Method skill = Hero.class.getMethod("skill");
        //使用方法。
        skill.invoke(hero);
        Method skill1 = Hero.class.getDeclaredMethod("skill");

        Hero.class.getFields();
        Hero.class.getField(" ");

        Method[] methods = Hero.class.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

    }

    //接着反射；
    @Test
    public void t4() throws Exception {
        Student instance = com.Morning.com.about_recursion.Test.getInstance(Student.class);

        // 获得了对象。
        Object o = com.Morning.com.about_recursion.Test.getInstance("com.Morning.com.about_recursion.Hero");
        System.out.println(o.toString());
    }

    // 可变参数
    @Test
    public  void t3 (){
        name("zhangSan");
        name("zhnagSan","LiSi");

        String [] arr = {"Anna" , "Lini" ,"Ken"};
        name(arr);
    }

    // 只要符合String类型，names可以传任意个
    /**
     * 演示可变参数
     * @param names 参数 。把names看作数组存在，类型为String。当然也可以直接是数组。
     */
    public  void name (String... names){

        // 把names看作数组存在，类型为String。当然也可以直接是数组。
        for (String name : names) {
            System.out.print(name + "\t");
        }
        System.out.println();
    }

}
