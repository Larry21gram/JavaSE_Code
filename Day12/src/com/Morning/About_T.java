package com.Morning;

import com.Morning.one.DatebaseUUtil;
import com.Morning.one.Student;
import com.Morning.one.Teacher;

public class About_T {
    public static void main(String[] args) {

        DatebaseUUtil<Student> studentDatebaseUUtil = new DatebaseUUtil<>();
        studentDatebaseUUtil.save(new Student());
        DatebaseUUtil<Teacher> teacherDatebaseUUtil = new DatebaseUUtil<>();
        teacherDatebaseUUtil.save(new Teacher());

    }

    // T 表示方法返回任意       后T 表示接受任意
    public  static <T> void  test (T t){
        
    }
    public  static  <E> E test2(E e ) {
        return null;
    }
}
