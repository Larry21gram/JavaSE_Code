package function;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class GetFirst {
    public static void main(String[] args) throws IOException {
        getFirst();
    }

    public static void getFirst() throws IOException {
        URL url = new URL("http://192.168.20.221:8080/day16/first");
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0 ;
        StringBuffer buffer = new StringBuffer();
        while ((len = inputStream.read(bytes))!= -1){
            buffer.append(new String(bytes,0,len));
        }
        System.out.println(buffer.toString());

    }
}
