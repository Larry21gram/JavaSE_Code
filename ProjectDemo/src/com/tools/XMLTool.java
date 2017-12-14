package com.tools;

import com.bean.Weather;
import com.except.NoPersonException;
import com.loginandregister.Person;
import net.sf.json.JSONObject;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class XMLTool {
    private static String address = "C:\\Users\\lanou\\Desktop\\JavaSE_Code\\ProjectDemo\\src\\data";
    private static int i = 0 ;
    private static SAXReader reader = new SAXReader();
    private static Document document = null;


    //写入
    public static void put(Person person) throws DocumentException, IOException {
         document = reader.read(new File(address));
        Element rootElement = document.getRootElement();

        i++;
        Element persons = rootElement.addElement("person");

        persons.addAttribute("user",person.getUser());
        Element name = persons.addElement("name");
        name.addText(person.getName());
        Element passworld = persons.addElement("passworld");
        passworld.addText(person.getPassworld());

        XMLWriter xmlWriter = new XMLWriter(new FileWriter(address));
        xmlWriter.write(document);
        xmlWriter.close();
    }

    public static boolean isExsited(String user) throws DocumentException {
        document = reader.read(new File(address));
        Element rootElement = document.getRootElement();

        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            List<Attribute> attributes = element.attributes();
            for (Attribute attribute : attributes) {
                if (attribute.getName().equals(user)){
                    return true;
                }
            }
        }
        return false;
    }

    public  static Person ckeckUser(String user, String passworld) throws DocumentException, NoPersonException {
        document = reader.read(new File(address));
        boolean flag1 = false;
        boolean flag2 = false;

        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();

        //list下
        for (Element element : elements) {

            //person下
            if (element != null) {
                if (element.attributes() != null) {

                    List<Attribute> attributes = element.attributes();

                    for (Attribute attribute : attributes) {

                        if (attribute != null && attribute.getName().equals("user")) {
                            flag1 = true;
                        }
                    }
                }

                if (flag1) {
                List<Element> elements1 = element.elements();

                    String name = null ;
                    for (Element element1 : elements1) {
                        if (element1 != null && element1.getName().equals("name") ){
                            name = element1.getText();
                        }
                        if (element1 != null && element1.getName().equals("passworld") && element1.getText().equals(passworld)) {
                           flag2 = true ;
                        }
                    }
                    if (flag2) {
                        return new Person(name,user,passworld);
                    }
                }

            }
        }
        if (flag1 == false){
            System.out.println("用户名错误！");
        }
        else {
            System.out.println("密码错误！！");
        }
        return null;
    }

    public static void translate (String string) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(string);
        Element rootElement = document.getRootElement();
        Element nickname = rootElement.element("nickname");
        System.out.println(nickname.getText());
    }

    //天气查询
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
