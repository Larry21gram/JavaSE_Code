package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws IOException {
        //定义一个端口8080
        DatagramSocket ds = new DatagramSocket(8080);

        byte[] b = new byte[1024];

        //定义一个数据包
        DatagramPacket dp = new DatagramPacket(b,0,b.length);

      while (true){
        //调用recevie方法，将ds中的数据出入dp中
          ds.receive(dp);

          // 将dp中的数据拿出来。
//        byte[] data = dp.getData();

          //
          String data = new String(dp.getData(),0,dp.getData().length);
          if (dp.getData().length > 0){

          }
          //输出打印
          System.out.println(data);

          //获得来源地址
          String hostName = dp.getAddress().getHostName();
          System.out.println("form:" + hostName);
      }
    }
}
