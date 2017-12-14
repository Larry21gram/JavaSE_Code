package com.function;

import com.loginandregister.Person;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        /**
         * 五，手速游戏
         提示用户：
         选择等级：困难（30个字符），适中（20个字符），简单（10个字符）
         用户选择后，提示用户：
         倒计时3秒钟后开始
         倒计时2秒钟后开始
         倒计时1秒钟后开始
         开始
         然后随机从键盘按键中抽取数字或字母或符号，拼凑相应个数的字符串。
         在控制台展示给用户。
         （
         要求，困难模式中要含有字符：~！@#￥%^&*（）{}[]\/.,<>?_-+=
         适中模式中，要含有大小写字母的变化
         简单模式中，有字母和数字即可
         ）

         在开始字样显示后，一直到用户输入完信息，提供给用户一个计算的时间。
         将用户的游戏时间，和用户信息通过网址（注1）提交。
         score的单位为毫秒
         */

        playGame();
    }

    private static final int YES = 1;
    private static final int NO = 2 ;

    private static final int HARD = 1;
    private static final int NORMAL = 2;
    private static final int EASY = 3 ;

    private  static long time ;

    public static long playGame() {
        Scanner input = new Scanner(System.in);

        int key = 0 ;

        System.out.println("欢迎大佬来到手速游戏");
        while (true) {
            System.out.println("开始游戏？\n1、Yes\t\t2、No");
            key = input.nextInt();
            if (key == YES) {
                System.out.println("请选择等级：\n1、困难（30个字符）\t2、适中（20个字符）\t3、简单（10个字符）");
                switch (key=input.nextInt()){
                    case HARD :
                        String string = getString(HARD);
                        System.out.println(string);
                        return time = rule(HARD,string);

                    case NORMAL:
                        String string1 = getString(NORMAL);
                        System.out.println(string1);
                       return time = rule(NORMAL,string1);

                    case EASY:
                        String string2 = getString(EASY);
                        System.out.println(string2);
                        return time = rule(EASY,string2);

                    default:
                        System.out.println("无此选项！");
                        break;
                }
            } else if (key == NO) {
                System.out.println("恭送大佬 ^_^ ");
                break;
            } else {
                System.out.println("输入错误！！");
            }
        }
        return 0;
    }

    private static long rule(int key , String string){

        Scanner input = new Scanner(System.in);
        System.out.println("准备好了吗？\n1、Yes\t\t2、No");
        if (YES == input.nextInt()){
            for (int i = 3; i >0; i--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("倒计时"+ i +"秒钟后开始");
            }
            System.out.println("开始计时：");
            return play(key,string);
        }else {
            System.out.println("欢迎下次再来！");
            return 0;
        }
    }

    //计时器
    public static long play(int key ,String string){
        Scanner input = new Scanner(System.in);
        long start = 0 ,end = 0;
        String s = null;
        start = System.currentTimeMillis();
        if (input.hasNext()){
            while (end == 0){
                s = input.nextLine();
                switch (key){
                    case HARD:
                        check(string, s);
                        break;
                    case NORMAL:
                        check(string, s);
                        break;
                    case EASY:
                        if (s.equalsIgnoreCase(string)){
                            end = System.currentTimeMillis();
                            System.out.println("恭喜你完成挑战！");
                        }else {
                            System.out.println("输入错误！");
                        }
                        break;
                }
            }
        }
        return  end - start;
    }

    private static void check(String string, String s) {
        long end;
        if (s.equals(string)){
            end = System.currentTimeMillis();
            System.out.println("恭喜你完成挑战！");
        }else {
            System.out.println("输入错误！请重新输入");
        }
        return;
    }

    //随机字符
    private static  String getString(int key ){
        StringBuffer buffer = new StringBuffer();
        switch (key){
            case HARD:
                //困难模式中要含有字符：~！@#￥%^&*（）{}[]\/.,<>?_-+= 33 -- 126
                for (int i = 0; i <30 ; i++) {
                    int a = (int) (Math.random() * (126 - 32) + 32);
                    char ch = (char) a;
                    buffer.append(ch);
                }
                System.out.println(buffer.toString());
                break;
            case NORMAL:

                //适中模式中，要含有大小写字母的变化 65 -- 90 97 --122
                for (int i = 0; i < 20; i++) {
                    char c = (char) (int) (Math.random() * 26 + 65);
                    char cc = (char) (int) (Math.random() * 26 + 97);
                    if (Math.random() >= 0.5){
                        buffer.append(c);
                    }else {
                        buffer.append(cc);
                    }
                }
                break;
            case EASY:
                // 简单模式中，有字母和数字即可 48 -- 57
                for (int i = 0; i < 10; i++) {
                    int a = (int) (Math.random() * 10 + 48);
                    int c = (int) (Math.random() * 26 + 65);
                    char cc = (char) c;
                    char aa = (char) a;
                    if (Math.random() >=0.5){
                        buffer.append(aa);
                    }else {
                        buffer.append(cc);
                    }
                }

                break;
        }
        return  buffer.toString();
    }

    //上传数据
    public  static void putScore(Person p , long score) throws IOException {
        URL url = new URL("http://192.168.20.221:8080/day16/first?"+ "nicheng" +p.getName()+"score"+ score);
        url.openConnection();
        System.out.println("游戏结束！");

    }
}
