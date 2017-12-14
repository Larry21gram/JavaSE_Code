package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Stream {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter(new File("src//io//text.txt"));

        fileWriter.write("将军角弓不得控，都护铁衣冷难着。");

        fileWriter.close();
    }
}
