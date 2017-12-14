package com.loginandregister;

import Tools.XMLTool;
import com.except.NoPersonException;
import org.dom4j.DocumentException;

import java.util.Scanner;

public class Login {

    private static String user;
    private static String passworld;
    public static void main(String[] args) {

        login();

    }

    public static Person login() {
        Scanner input = new Scanner(System.in);

        System.out.println("欢迎大佬回来！");

        Person person = null;
        boolean flag = true;
        while (flag){
            System.out.println("请输入用户名：");
            user = input.next();
            System.out.println("请输入密码：");
            passworld = input.next();
            try {
                person = XMLTool.ckeckUser(user, passworld);
            } catch (DocumentException e) {
                e.getMessage();
            } catch (NoPersonException e) {
                e.getMessage();
            }
            flag = false ;
        }
        if (person != null){
            System.out.println("登录成功，信息如下：");
            System.out.println("昵称：" + person.getName()+", 用户名：" + person.getUser() +", 密码："+ person.getPassworld());
        }
        return person;
    }


}
