package com.study;

public class Person {
    private String name ;
    private  String user ;
    private  String passworld ;
    private  String job ;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public Person() {

    }

    public Person(String name, String user, String passworld, String job) {

        this.name = name;
        this.user = user;
        this.passworld = passworld;
        this.job = job;
    }

    public String toDeepString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", user='" + user + '\'' +
                ", passworld='" + passworld + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

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
}
