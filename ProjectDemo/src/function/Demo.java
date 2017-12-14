package function;

import net.sf.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Demo {
    public static void main(String[] args) throws IOException {
//        weatherFond("北京");

    }

    public static void weatherFond( String string) throws IOException {
        // 1、查询天气

        // 建立资源定位符
        URL url = new URL("http://www.sojson.com/open/api/weather/json.shtml?city=" + string);

        URLConnection connection = url.openConnection();

        //从网络中获取数据， 建立流。
        InputStream inputStream = connection.getInputStream();

        //获得json字符串
        byte[] bytes = new byte[1024 * 8];
        StringBuffer buffer = new StringBuffer();

        int len = 0;
        while ((len = inputStream.read(bytes)) != -1) {
            buffer.append(new String(bytes, 0, len));
        }

        //解析获得的数据
        JSONObject jsonObject = JSONObject.fromObject(buffer.toString());
        Weather weather = (Weather) JSONObject.toBean(jsonObject,Weather.class);

        System.out.println(weather);

        inputStream.close();
    }


}
