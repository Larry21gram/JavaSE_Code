package com.code;

public class Person {

    // 姓名，用户名，密码，职业四个属性
    private String name ;
    private String user ;
    private String passworld;
    private String job ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person(String name, String user, String passworld, String job) {
        this.name = name;
        this.user = user;
        this.passworld = passworld;
        this.job = job;
    }

    public Person() {
    }

    @Override
   public String toString() {
        return "Person{" +
                "user='" + user + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public String toDeepString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", user='" + user + '\'' +
                ", passworld=" + passworld +
                ", job='" + job + '\'' +
                '}';
    }
}
