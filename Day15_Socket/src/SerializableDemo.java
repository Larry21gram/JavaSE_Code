import org.junit.Test;

import java.io.*;

public class SerializableDemo {

    @Test
    //序列化（只能是实际对象。）
    public void write() throws IOException {
        Pet pet = new Pet("雪拉瑞",1);

        FileOutputStream fileOutputStream = new FileOutputStream("src\\pet.out");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(pet);

        objectOutputStream.flush();
        objectOutputStream.close();
    }

    @Test
    //反序列化。
    public void read() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src\\pet.out");

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object o = objectInputStream.readObject();

        System.out.println(o);

        objectInputStream.close();
    }
}
