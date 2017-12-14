package homework.about_recursion.exceptions;

import com.after.exception.EatException;

public class LoginException extends EatException{
    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public String inputNameException(){
        return "姓名输入错误";
    }

    public String inputUserNameException(){
        return "用户名输入错误";
    }

    public String inputUserNameException2(){
        return "用户名或姓名错误";
    }

    public String inputPassworldException2(){
        return "密码错误";
    }

    public String inputPassworldException(){
        return "密码与用户名不匹配";
    }

    public String inputJobException(){
        return "职业与用户不匹配";
    }
}