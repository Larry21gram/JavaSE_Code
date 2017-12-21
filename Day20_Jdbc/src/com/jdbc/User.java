package com.jdbc;

public class User {
    private String name;
    private int id ;
    private int age ;
    private String loc;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge(int anInt) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", loc='" + loc + '\'' +
                '}';
    }

    public User(String name, int id, int age, String loc) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.loc = loc;
    }
}
