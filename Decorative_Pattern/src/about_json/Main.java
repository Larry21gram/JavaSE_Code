package about_json;

import net.sf.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    /**
     * JSON 解析 网站数据。
     *
     * JSONObject 解析对象。
     * JsonArray  解析数组。
     */

    public static void main(String[] args) throws IOException {
        //建立路径,URL统一资源定位符。网址：绝对路径。
        URL url = new URL("https://api.douban.com/v2/book/1220562");

        URLConnection connection = url.openConnection();

        //从网络中获取数据， 建立流。
        InputStream inputStream = connection.getInputStream();

        byte [] bytes = new byte[1024*8];
        StringBuffer buffer = new StringBuffer();

        int len = 0 ;
        while ((len = inputStream.read(bytes))!= -1){
            buffer.append(new String(bytes,0,len));
        }

        System.out.println(buffer);

        /**
         * 我们把json 这个字符串转为Java对象，
         *
         * GsonFormat 可将json转为实体类
         *
         * json架包可直接将字符串转为实体类。
         *
         *  JSONObject 解析对象。
         * JsonArray  解析数组。
         */

        // fromObject() 参数为字符串。
        JSONObject jsonObject = JSONObject.fromObject(buffer.toString());

        Book book = (Book) JSONObject.toBean(jsonObject,Book.class);

        System.out.println("id为：" + book.getId());
    }
}
