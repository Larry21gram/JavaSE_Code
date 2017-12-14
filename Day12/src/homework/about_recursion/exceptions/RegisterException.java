package homework.about_recursion.exceptions;

public class RegisterException extends Exception {
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

    public String UserNameException2(){
        return "用户名或姓名错误";
    }

    public String inputPassworldException2(){
        return "密码错误";
    }

    public String PassworldException(){
        return "密码与用户名不匹配";
    }

    public String inputJobException(){
        return "职业与用户不匹配";
    }
}
