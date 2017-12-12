package com.study.tcp.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class LiSi {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(8888);

        Socket socket = serverSocket.accept();

        byte[] b = new byte[1024];

        InputStream inputStream = socket.getInputStream();

        //获得输出流。
        OutputStream outputStream = socket.getOutputStream();

        int len = 0 ;
        StringBuffer stringBuffer = new StringBuffer();
        while ((len = inputStream.read(b))!= -1){
//            stringBuffer.append(new String(b,0,len));
            System.out.println(new String(b,0,len));

            //把stringBuffer清空
            stringBuffer.setLength(0);
            String s = input.nextLine();
//            outputStream.write("不好，不在，不知道".getBytes());
            outputStream.write(s.getBytes());


        }

    }
}
