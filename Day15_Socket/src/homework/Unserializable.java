package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Unserializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        read();
    }

    public static void read() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\pet.out");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        //调用readObject方法读取对象。
        Object o = objectInputStream.readObject();

        System.out.println(o);

        objectInputStream.close();
    }
}
