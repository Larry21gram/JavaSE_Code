package com.Morning.com.about_recursion;

public class Hero {
    private  String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                '}';
    }

    public void skill(){
        System.out.println("释放了技能！！！");
    }

    public void show(String what){
        System.out.println("show" + what);
    }
}
