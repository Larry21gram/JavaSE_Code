package com.Morning.one;

public class Student {
    //学号
    private int sId;

    private  String name ;
    private  String gender ;
    private  int  age ;

    public int getsId() {
        return sId;
    }

    public Student() {
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
