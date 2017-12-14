package homework.TcpTalkMore;

import homework.TalkMore;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Recieve {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();

        //获得发送方发送的对象。
        InputStream inputStream = socket.getInputStream();

        //获得输出流。
        OutputStream outputStream = socket.getOutputStream();

        byte[] b = new byte[1024];

        //创建数据接受储存
        String string = null;
        //创建数据缓冲区
        byte[] bytes = new byte[1024];
        StringBuffer buffer = new StringBuffer();

        //首先发送第一次问候，如果回应则把所有的已储存的数据发送给对方
        //如果没有则继续储存数据。
        outputStream.write("在吗？".getBytes());

        while (true){

            b:while (!scanner.next().equals("quite")){

                int read = inputStream.read(bytes);
                System.out.println(read);
                System.out.println(new String(bytes,0,read));
                buffer.append(scanner.next());
                if (read != -1){
                    break b;
                }
            }

            outputStream.write(buffer.toString().getBytes());
            outputStream.flush();
        }
    }
}
