package com.study.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Send {
    public static void main(String[] args) throws IOException {
        //创建一个scoket对象，指定目标的 IP地址
        Socket socket = new Socket("192.168.20.161",9999);

        //获得scoket输出工具，输出流outputStream
        OutputStream outputStream = socket.getOutputStream();

        //调用这个工具的写入方法，把要写入的作为参数传进去，参数是字节数组。
        String s = "春江潮水连海平，海上明月共潮生。" +
                "滟滟随波千万里，何处春江无月明！" +
                "江流宛转绕芳甸，月照花林皆似霰。" +
                "空里流霜不觉飞，汀上白沙看不见。" +
                "江天一色无纤尘，皎皎空中孤月轮。" +
                "江畔何人初见月？江月何年初照人？" +
                "人生代代无穷已，江月年年望相似。" +
                "不知江月待何人，但见长江送流水。" +
                "白云一片去悠悠，青枫浦上不胜愁。" +
                "谁家今夜扁舟子？何处相思明月楼？" +
                "可怜楼上月徘徊，应照离人妆镜台。" +
                "玉户帘中卷不去，捣衣砧上拂还来。" +
                "此时相望不相闻，愿逐月华流照君。" +
                "鸿雁长飞光不度，鱼龙潜跃水成文。" +
                "昨夜闲潭梦落花，可怜春半不还家。" +
                "江水流春去欲尽，江潭落月复西斜。" +
                "斜月沉沉藏海雾，碣石潇湘无限路。" +
                "不知乘月几人归，落月摇情满江树";
        outputStream.write(s.getBytes());

        //关闭socket
        socket.close();

    }
}
