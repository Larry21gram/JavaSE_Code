package loginandregister;

import except.*;
import org.dom4j.DocumentException;
import util.Tools;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Register {

    private  static  String name = null ;
    private  static  String user = null;
    private  static  String passworld = null;
    public static void main(String[] args) throws IOException, DocumentException {
        register();


    }

    public static void register() throws IOException, DocumentException {
        //，用户名只能是手机号或邮箱（正则表达式判断）
        // 密码要大于6位小于14位，一定要有大小写字母和数字

        Scanner input = new Scanner(System.in);

        System.out.println("欢迎注册：");
        System.out.println("请输入姓名：");
        name = input.next();

        boolean flag = true;
        while (flag){
            System.out.println("请输入用户名(手机号或邮箱)：");
            String str = "1[3,5,7,8]\\d{9}";
            String str2 = "[1,2]\\d{5,9}@.*com]";
            user = input.next();
            try {
                alreadyExisted(user);
            boolean matches = Pattern.matches(str,user );
            boolean matches1 = Pattern.matches(str2, user);
            if (matches || matches1){
                flag = false;
            }else {
                try {
                    throw new UserNameFormatException();
                } catch (UserNameFormatException e) {
                    e.getMessage();
                }
            }
            } catch (DocumentException e) {
                e.printStackTrace();
            } catch (UserAlreadyExistedException e) {
                e.getMessage();
            }
        }

        boolean key = true ;
        while (key){
            System.out.println("请输入密码");
            passworld = input.next();
            try {
                if (!passworldIsSimple(passworld)){
                    System.out.println("请再次输入密码：");
                    if (!passworld.equals(input.next())){
                        try {
                            throw new PasswordException();
                        } catch (PasswordException e) {
                            e.getMessage();
                        }
                    }else {
                        key = false ;
                    }
                }
            } catch (NoLettersException e) {
                e.getMessage();
            } catch (NoNumberException e) {
                e.getMessage();
            }
        }

        Person person = new Person(name, user, passworld);
        System.out.println("注册成功！\n" + person.toString());

        Tools.put(person);
    }

    private static void alreadyExisted(String user) throws DocumentException, UserAlreadyExistedException {
       if (Tools.isExsited(user)){
           throw new UserAlreadyExistedException();
       }
    }

    public static boolean passworldIsSimple (String passworld ) throws NoLettersException, NoNumberException {
        int isSimple = 0;
//        if (passworld.contains("\\s+")){
//            return true;
//        }
        a:for (int i = 0; i <=9; i++) {
            while(passworld.contains(i+"")){
                isSimple++;
                break a;
            }
        }
        // 如果等于零。则不含数字 isSimple == 1 ;
        if (isSimple != 1){
            throw  new NoNumberException();
        }
//        System.out.println("判断完数字了"+ isSimple);
        // 含有数字 isSimple == 1
        b:for (char i = 'a';i <= 'z'; i ++){
            while (passworld.contains(i+"")){
                isSimple++;
                break b;
            }
        }
//        System.out.println("isSimple:" + isSimple);
        //检查是否有大写
        for (char i = 'A'; i <= 'Z' ; i++) {
            c:while (passworld.contains(i+"")){
                isSimple++;
                break c;
            }
        }

        //如果有字母则 isSimple == 2 ；
        if (isSimple != 1 && isSimple != 2){
            throw new NoLettersException();
        }
//        System.out.println("检查完字母了");
        return false;
    }
}
