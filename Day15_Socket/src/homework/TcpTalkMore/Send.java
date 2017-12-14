package homework.TcpTalkMore;

import homework.TalkMore;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {

        //创建控制台输入
        Scanner scanner = new Scanner(System.in);

        //创建发送对象的套接字对象
        Socket socket = new Socket("192.168.20.161",9999);

        //获得scoket输出工具，输出流outputStream
        OutputStream outputStream = socket.getOutputStream();

        //获得接收工具
        InputStream inputStream = socket.getInputStream();

        //创建数据接受储存
        String string = null;
        //创建数据缓冲区
        byte[] bytes = new byte[1024];
        StringBuffer buffer = new StringBuffer();

        //首先发送第一次问候，如果回应则把所有的已储存的数据发送给对方
        //如果没有则继续储存数据。
        outputStream.write("在吗？".getBytes());

        while (true){

           b: while (!scanner.next().equals("quite")){

                int read = inputStream.read(bytes);
                System.out.println(new String(bytes,0,read));
                System.out.println(read);
                buffer.append(scanner.next());

                if (read != -1){
                    break b
                            ;
                }
            }
            outputStream.write(buffer.toString().getBytes());
            outputStream.flush();
        }

    }
}
