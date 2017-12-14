package main;

import except.NoPersonException;
import loginandregister.Login;
import loginandregister.Person;
import loginandregister.Register;
import org.dom4j.DocumentException;
import util.Tools;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    private static final int WEATHER = 1 ;
    private static final int PHONE_NUMBER = 2;
    private static final int GAME = 3 ;
    private static final int SCORE = 4;
    private static final int QUITE = 5;

    public static void main(String[] args) throws IOException, DocumentException, NoPersonException {

        Scanner input = new Scanner(System.in);
        System.out.println("欢迎大佬 ^_^ ");
        fun(input);
    }

    public static void fun(Scanner input) throws IOException, DocumentException, NoPersonException {

        boolean flag = true;
        while(flag){
        System.out.println("请选择登录还是注册：\n1、登录\t\t2、注册\t\t3、退出");
            if (input.hasNextInt()){
                int key = input.nextInt();
                if (key == 1 ){
                    //登录
                    Person person = Login.login();
                    //开始功能
                    if (person != null){
                        function(person);
                    }
                }
                else if (key == 2){
                    Register.register();
                }
                else if (key == 3){
                    System.out.println("已退出功能！");
                    flag = false ;
                }
                else{
                    System.out.println("输入错误！");
                }
            }
        }
    }

    public static void function(Person person) throws IOException, DocumentException {
        /**
         3，提示用户功能：
         查询天气
         查询手机号归属地
         手速游戏
         查询手速游戏前十用户
         */
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("请选择功能：\n1、查询天气\t2、查询手机号归属地\t3、手速游戏\t4、查询手速游戏第一名用户\t5、退出");
            if (input.hasNextInt()){
                int key = input.nextInt();
                String str = null;
                switch (key){
                    case WEATHER:
                        System.out.println("请输入城市");
                        str = input.next();
                        Tools.weatherFond(str);
                        break;
                    case PHONE_NUMBER:
                        System.out.println("请输入手机号码");
                        boolean flag = true;
                        while (flag){
                            str = input.next();
                            if (Pattern.matches("1[3,5,7,8]\\d{9}",str)) {
                                Tools.callBackFond(str);
                                flag = false;
                            }else{
                                System.out.println("手机号码输入错误！\n请重新输入：");
                            }
                        }
                        break;
                    case GAME:
                        long scoer = Tools.playGame();
                        System.out.println("你的成绩为：" + scoer+ "毫秒");
                        Tools.putScore(person,scoer);
                        break;

                    case SCORE:
                        Tools.getFirst();
                        break;

                    case QUITE:
                        System.out.println("欢迎下次再来 ^_^ ");
                        return;
                    default:
                        System.out.println("输入错误！");
                        break;
                }

            }
        }
    }
}
