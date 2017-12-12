package com.study.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
    public static void main(String[] args) throws IOException {

        //创建一个接受方，serverSocket，构造方法传入参数8888 ，参数为端口号。
        ServerSocket serverSocket = new ServerSocket(9999);

        //从接收方，得到谁传过来的，这里通过接受方获得发送方,
        //accept为阻塞式方法，如果获得不到发送方的socket，就会阻塞程序。不继续执行。
        Socket socket = serverSocket.accept();

        //获得发送方发送的对象。
        InputStream inputStream = socket.getInputStream();

        byte[] b = new byte[1024];

        // 调用read方法将socket读到字节数组中。
//        int len = inputStream.read(b);

        StringBuffer stringBuffer = new StringBuffer();
        int len = 0;
        while ((len = inputStream.read(b)) != -1){
//            System.out.println(new String(b ,0 ,len));
            stringBuffer.append(new String(b ,0 ,len));
        }

        //这里使用接受的字符串。
        System.out.println(stringBuffer);
        //从0 取 len 个内容。
//        System.out.println(new String(b ,0,len));


    }
}
