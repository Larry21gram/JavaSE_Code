package com.Tool;

import com.exception.NoLettersException;
import com.exception.NoNumberException;

public class Checke {

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
