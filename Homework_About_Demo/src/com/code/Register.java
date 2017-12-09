package com.code;

import com.DataTool;
import com.Tool.Checke;
import com.exception.NoLettersException;
import com.exception.NoNumberException;
import com.exception.UserAlreadyExistedException;

import java.io.IOException;
import java.util.Scanner;

// 注册类
public class Register {
    private static final int Worker = 1;
    private static final int Doctor = 2;
    private static final int Teacher = 3;
    private static final int Boss = 4;

   public static void listRegister()  {

       Input input =  new Input().invoke();
       Scanner scanner = input.getScanner();
       String name = input.getName();
       String user = input.getUser();
       String passworld = input.getPassworld();

       while(true){
           int key = 0 ;
           System.out.println("请选择职业：\n1、Worker\t2、Doctor\t3、Teacher\t4、Boss");
           key = scanner.nextInt();
           Person person = null;
           switch (key){
               case Worker:
                   person = new Worker(name, user, passworld, "Worker");
                   show(person);
                   return;
               case Doctor:
                   person = new Doctor(name, user, passworld, "Doctor");
                   show(person);
                  return;
               case Teacher:
                   person = new Teacher(name,user,passworld,"Teacher");
                   show(person);
                   return;
               case Boss:
                   person = new Boss(name,user,passworld,"Boss");
                   show(person);
                   return;
               default:
                   System.out.println(" 无此项选择！！！");
                   break;
           }
       }
    }

    private static void show(Person person) {
        UserData.list.add(person);
        System.out.println("注册成功");
        System.out.println(person.toString());
    }

    public static void mapRegister() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎注册：");

        String user = null;
        while(true){
            System.out.println("请输入用户名：");
            user = scanner.next();
            try {
                userCheck(user);
            } catch (UserAlreadyExistedException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }

        String name = null;
        System.out.println("请输入姓名");
        name = scanner.next();

        boolean flag = false;
        String passwords = null;
        while (!flag){
            System.out.println("请输入八位密码：");
            passwords = scanner.next();
            System.out.println(passwords);
            try {
                flag = !Checke.passworldIsSimple(passwords);
            } catch (NoLettersException e) {
                System.out.println(e.getMessage());
            } catch (NoNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        while(true){
            int key = 0 ;
            System.out.println("请选择职业：\n1、Worker\t2、Doctor\t3、Teacher\t4、Boss");
            key = scanner.nextInt();
            Person person = null;
            switch (key){
                case Worker:
                    person = new Worker(name, user, passwords, "Worker");
//                    show2(person);
                    DataTool.addXml(person);
                    return;
                case Doctor:
                    person = new Doctor(name, user, passwords, "Doctor");
//                    show2(person);
                    DataTool.addXml(person);
                    return;
                case Teacher:
                    person = new Teacher(name,user,passwords,"Teacher");
//                    show2(person);
                    DataTool.addXml(person);
                    return;
                case Boss:
                    person = new Boss(name,user,passwords,"Boss");
//                    show2(person);
                    DataTool.addXml(person);
                    return;
                default:
                    System.out.println(" 无此项选择！！！");
                    break;
            }
        }
    }

    private static void show2(Person person) {
        UserData.map.put(person.getUser(),person);
        System.out.println("注册成功");
        System.out.println(person.toString());
    }

    private static class Input {
        private Scanner scanner;
        private String name;
        private String user;
        private String passworld;

        public Scanner getScanner() {
            return scanner;
        }

        public String getName() {
            return name;
        }

        public String getUser() {
            return user;
        }

        public String getPassworld() {
            return passworld;
        }

        public Input invoke()  {
            scanner = new Scanner(System.in);
            System.out.println("欢迎注册：");

            user = null;
            while(true){
                System.out.println("请输入用户名：");
                user = scanner.next();
                try {
                    userCheck();
                } catch (UserAlreadyExistedException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                break;
            }

            name = null;
            System.out.println("请输入姓名");
            name = scanner.next();

            boolean flag = false;
            while (!flag){
                System.out.println("请输入八位密码：");
                passworld = scanner.nextLine();
                 try {
                     flag = Checke.passworldIsSimple(passworld);
                 } catch (NoLettersException e) {
                     System.out.println(e.getMessage());
                 } catch (NoNumberException e) {
                     System.out.println(e.getMessage());
                 }
                 System.out.println("为啥呢？");
            }
            return this;
        }

        public void userCheck() throws UserAlreadyExistedException {
            for (Person p: UserData.list) {
                if (p.getUser().equals(user)){
                    throw new UserAlreadyExistedException();
                }
            }
            for (String s : UserData.map.keySet()
                 ) {
                if (s.equals(user)){
                    throw new UserAlreadyExistedException();
                }
            }
        }
    }


    public static void userCheck( String user) throws UserAlreadyExistedException {
        for (Person p: UserData.list) {
            if (p.getUser().equals(user)){
                throw new UserAlreadyExistedException();
            }
        }
        for (String s : UserData.map.keySet()
                ) {
            if (s.equals(user)){
                throw new UserAlreadyExistedException();
            }
        }
    }
}
