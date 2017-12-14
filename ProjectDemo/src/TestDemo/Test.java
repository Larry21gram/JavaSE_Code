package TestDemo;

import com.loginandregister.Login;
import com.loginandregister.Person;
import com.loginandregister.Register;
import function.CallBack;
import function.Game;
import function.GetFirst;
import function.Weather;
import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {

    private static final int WEATHER = 1 ;
    private static final int PHONE_NUMBER = 2;
    private static final int GAME = 3 ;
    private static final int SCORE = 4;
    private static final int QUITE = 5;
    public static void main(String[] args) throws IOException, DocumentException {

        Scanner input = new Scanner(System.in);
        System.out.println("欢迎大佬 ^_^ ");

        fun(input);
    }

    public static void fun(Scanner input) throws IOException, DocumentException {

        boolean flag = true;
        System.out.println("请选择登录还是注册：\n1、登录\t\t2、注册\t\t3、退出");
        while(flag){
            if (input.hasNextInt()){
                int key = input.nextInt();
                if (key == 1 ){
                    //登录
                    Person person = Login.login();
                    //开始功能
                    function(person);
                }
                else if (key == 2){
                    Register.register();
                }
                else if (key == 3){
                    flag = false ;
                }
                else{
                    System.out.println("输入错误！");
                }
            }
        }
    }

    public static void function(Person person) throws IOException {
        /**
         3，提示用户功能：
         查询天气
         查询手机号归属地
         手速游戏
         查询手速游戏前十用户
         */
        Scanner input = new Scanner(System.in);
        System.out.println("请选择功能：\n1、查询天气\t2、查询手机号归属地\t3、手速游戏\t4、查询手速游戏前十用户\t5、退出");
        while(true){
            if (input.hasNextInt()){
                int key = input.nextInt();
                String str = null;
                switch (key){
                    case WEATHER:
                        System.out.println("请输入城市");
                         str = input.next();
                        Weather.weatherFond(str);
                        break;
                    case PHONE_NUMBER:
                        System.out.println("请输入手机号码");
                        while (true){
                            str = input.next();
                            if (Pattern.matches(str,"1[3,5,7,8]\\d{9}")) {
                                CallBack.callBackFond(str);
                                break;
                            }else{
                                System.out.println("手机号码输入错误！\n请重新输入：");
                            }
                        }
                        break;
                    case GAME:
                        long scoer = Game.playGame();
                        System.out.println("你的成绩为：" + scoer+ "毫秒");
                        Game.putScore(person,scoer);
                        break;

                    case SCORE:
                        GetFirst.getFirst();
                        break;

                    case QUITE:
                        return;
                    default:
                        System.out.println("输入错误！");
                        break;
                }

            }
        }
    }
}