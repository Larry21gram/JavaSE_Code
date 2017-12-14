package except;

public class NoLettersException extends Exception {
    @Override
    public String getMessage() {
        return "密码没有字母";
    }
}
