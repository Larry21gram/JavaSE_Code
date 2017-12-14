package except;

public class PasswordException extends Throwable {
    @Override
    public String getMessage() {
        return "两次密码不相同";
    }
}
