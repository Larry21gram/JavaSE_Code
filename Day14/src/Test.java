import com.aboutThread.Student;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Student student = Student.class.newInstance();
        Method[] methods = Student.class.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
