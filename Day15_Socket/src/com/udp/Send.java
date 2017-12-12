package com.udp;

import com.util.Constants;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        DatagramSocket datagramSocket = new DatagramSocket(8081);

        //创建一个地址对象，将ip地址放入
        InetAddress address = InetAddress.getByName("192.168.20.161");

        byte[] bytes = new byte[1024];

       while(input.hasNext()){
           bytes = input.next().getBytes();

           //创建用来储存的数据包
           DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,address,8080);

           datagramSocket.send(datagramPacket);
       }
    }
}
