package com.function;

import com.tools.XMLTool;
import org.dom4j.DocumentException;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class GetFirst {
    public static void main(String[] args) throws IOException, DocumentException {
        getFirst();
    }

    public static void getFirst() throws IOException, DocumentException {
        URL url = new URL("http://192.168.20.221:8080/day16/first");
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0 ;
        StringBuffer buffer = new StringBuffer();
        while ((len = inputStream.read(bytes))!= -1){
            buffer.append(new String(bytes,0,len));
        }
        String string = buffer.toString();
        XMLTool.translate(string);
    }
}
