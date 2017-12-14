package homework.about_recursion.homeworks;

import homework.about_recursion.exceptions.RegisterException;

import java.util.Scanner;

//注册
public class Register {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("请进行注册：");
        System.out.println("请输入姓名：");
        String next ;
        if (input.hasNext()){
            next = input.next();

            System.out.println("请输入用户名：");
            String userName = null;
            try {
                if (input.hasNext()) {
                   userName = input.next();
                }
                new RegisterException();
            }catch (Exception e){
                System.out.println(new RegisterException().inputUserNameException());
            }
        }
    }

    public static void register(){
        /**
         * 注册
         */
        System.out.println("请进行注册：");

    }
}
