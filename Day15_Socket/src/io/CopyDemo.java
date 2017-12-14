package io;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("src//io//text.txt"));

        char[] chars = new char[1024];

        //返回值表示读了多长
        int read = fileReader.read(chars);

        FileWriter fileWriter = new FileWriter(new File("src//io//target.txt"));
        fileWriter.write(chars,0,read);

        fileReader.close();
        fileWriter.close();
    }
}
