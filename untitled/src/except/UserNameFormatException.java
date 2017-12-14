package except;

public class UserNameFormatException extends Exception {
    @Override
    public String getMessage() {
        return "用户名输入格式有误！";
    }
}
