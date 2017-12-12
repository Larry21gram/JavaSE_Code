package com.study.tcp.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ZhangSan {
    public static void main(String[] args) throws IOException {
        //把张三写成发送方
        Socket socket = new Socket("192.168.20.128",8888);

        Scanner input = new Scanner(System.in);

        OutputStream outputStream = socket.getOutputStream();

        InputStream inputStream = socket.getInputStream();

        String str = null;
        StringBuffer stringBuffer = new StringBuffer();

        byte[] buff = new byte[1024];

        outputStream.write("在？".getBytes());
        // 如果有输入。
        while (!(str = input.nextLine()).equals("quite")){

/*            //输出
            outputStream.write(str.getBytes());
            outputStream.flush();*/
            StringBuffer strb = stringBuffer.append(str);
//            System.out.println(str);

            int read = inputStream.read(buff);
            if (read != -1){
                outputStream.write(strb.toString().getBytes());
            }
            System.out.println(new String(buff,0,read));

        }

        //输出为quite则关闭流。
        socket.close();
    }
}
