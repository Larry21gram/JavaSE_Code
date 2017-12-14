package except;

public class NoNumberException extends Throwable {
    @Override
    public String getMessage() {
        return "密码没有数字";
    }
}
