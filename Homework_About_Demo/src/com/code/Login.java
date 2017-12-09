package com.code;


import com.exception.UserAndPassworldNoMatchedException;

import java.util.Scanner;

public class Login {

    public static void listLogin() throws UserAndPassworldNoMatchedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎登录：");
        int i = 0 ;
       while(i < 3){
           String user = null ;
           System.out.println("请输入用户名：");
           user = scanner.next();
           String passworld;
           System.out.println("请输入八位密码：");
           passworld = scanner.next();
           try{
               if (check(user, passworld)) return;
           }catch ( Exception e){
               System.out.println(e.getMessage());
               System.out.println("还有" + (3 - i) + "次机会！");
           }
           i ++ ;
       }
       if (i == 3 ){
           System.out.println("已退出！");
       }
    }

    public static boolean check(String user, String passworld) throws UserAndPassworldNoMatchedException {
        for (Person p : UserData.list) {
            if (p.getUser().equals(user) && p.getPassworld().equals(passworld)){
                System.out.println("登录成功");
                System.out.println(p.toDeepString());
                return true;
            }
        }
        throw new UserAndPassworldNoMatchedException();
    }

    public static void  mapLogin(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎登录：");
        int i = 0 ;
        while(i < 3){
            String user = null ;
            System.out.println("请输入用户名：");
            user = scanner.next();
            String passworld;
            System.out.println("请输入八位密码：");
            passworld = scanner.next();
            Person person = UserData.map.get(user);
            if (person != null && person.getPassworld().equals(passworld)) {
                System.out.println("登录成功");
                System.out.println(person.toDeepString());
                return;
            }
            System.out.println("没找到");
            i ++ ;
        }
    }
}
