package io;

import org.junit.Test;

import java.io.*;

public class BufferDemo {
    public static void main(String[] args) {

    }
    @Test
    public void show() throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\lanou\\Documents\\Tencent Files\\1639915400\\FileRecv\\线程之前的复习");

        //将自负读入流传入构造方法中
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        StringBuffer stringBuffer = new StringBuffer();
        //一行行读
        while ((line = bufferedReader.readLine())!= null){
            //添加内容
            stringBuffer.append(line + "\n");
        }

        System.out.println(stringBuffer);
    }

    @Test
    public  void showWrite() throws IOException {
        FileWriter fileWriter= new FileWriter(new File("src\\shoeWrite.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < 20; i++) {
            bufferedWriter.write(i + "");
            bufferedWriter.newLine(); // 新来一行

            bufferedWriter.flush(); //刷新，把流里所有字节输入到文件中
        }

        bufferedWriter.close();
    }
}
