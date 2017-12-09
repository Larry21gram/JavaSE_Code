package com.test;

import com.code.Login;
import com.code.Register;
import com.exception.UserAndPassworldNoMatchedException;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws UserAndPassworldNoMatchedException, IOException {
        Scanner scanner = new Scanner(System.in);

        //List集合装数据
//        listChoose(scanner);

        // Map集合装数据
        mapChoose(scanner);

    }

    public static void listChoose(Scanner scanner) throws UserAndPassworldNoMatchedException {
        while(true){
            System.out.println("请选择：\n1、注册\t\t2、登录");
            int key = scanner.nextInt();
            if (key == 1){
                Register.listRegister();
            }
            if (key == 2 ){
                Login.listLogin();
                break;
            }
        }
    }

    public static void mapChoose(Scanner scanner) throws IOException {
        while(true){
            System.out.println("请选择：\n1、注册\t\t2、登录");
            int key = scanner.nextInt();
            if (key == 1){
                Register.mapRegister();
            }
            if (key == 2 ){
                Login.mapLogin();
                break;
            }
        }
    }


}
