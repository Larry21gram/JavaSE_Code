package util;

import com.bean.CallBack;
import com.bean.Weather;
import except.NoPersonException;
import loginandregister.Person;
import net.sf.json.JSONObject;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Scanner;

public class Tools {

    private static final int YES = 1;
    private static final int NO = 2 ;

    private static final int HARD = 1;
    private static final int NORMAL = 2;
    private static final int EASY = 3 ;

    private  static long time ;

    private static String address = "C:\\Users\\lanou\\Desktop\\JavaSE_Code\\untitled\\src\\data";

    private static int i = 1 ;
    private static SAXReader reader = new SAXReader();
    private static Document document = null;

    //查寻号码归属地
    public static void callBackFond(String number) throws IOException {
        // 1、查询归属地

        // 建立资源定位符
        URL url = new URL("http://api.k780.com/?app=phone.get&phone="+number + "&appkey=10003&sign" +
                "=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json");

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
        CallBack callBack = (CallBack) JSONObject.toBean(jsonObject,CallBack.class);

        System.out.println(callBack);

        inputStream.close();
    }

    //获得第一名
    public static void getFirst() throws IOException, DocumentException {
        URL url = new URL("http://192.168.20.194:8080/day16/first");
        String string = scoreFondWay(url);
        Tools.translate(string);
    }

    //获得前十名

    private static String scoreFondWay(URL url) throws IOException {
        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0 ;
        StringBuffer buffer = new StringBuffer();
        while ((len = inputStream.read(bytes))!= -1){
            buffer.append(new String(bytes,0,len));
        }
        return buffer.toString();
    }

    public static void translate (String string) throws DocumentException {

        Document document = DocumentHelper.parseText(string);
        Element rootElement = document.getRootElement();
        Element nickname = rootElement.element("nickname");
        System.out.println("第一名为：" + nickname.getText());
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

    //写入
    public static void put(Person person) throws DocumentException, IOException {
        document = reader.read(new File(address));
        Element rootElement = document.getRootElement();

        i++;
        System.out.println(i);
        Element persons = rootElement.addElement("person"+i);
        persons.addAttribute("user",person.getUser());

        Element name = persons.addElement("name");
        name.addText(person.getName());

        Element passworld = persons.addElement("passworld");
        passworld.addText(person.getPassworld());

        XMLWriter xmlWriter = new XMLWriter(new FileWriter(address));
        xmlWriter.write(document);
        xmlWriter.close();
    }

    //判断用户是否存在
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

    //判断用户与密码是否匹配
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
            System.out.println("密码错误！！" +
                    "已退出！");
        }
        return null;
    }

    // 玩游戏
    public static long playGame() {
        Scanner input = new Scanner(System.in);

        int key = 0 ;

        System.out.println("欢迎大佬来到手速游戏");
        while (true) {
            System.out.println("开始游戏？\n1、Yes\t\t2、No");
            key = input.nextInt();
            if (key == YES) {
                System.out.println("请选择等级：\n1、困难（30个字符）\t2、适中（20个字符）\t3、简单（10个字符）");
                switch (key=input.nextInt()){
                    case HARD :
                        String string = getString(HARD);
                        System.out.println(string);
                        return time = rule(HARD,string);

                    case NORMAL:
                        String string1 = getString(NORMAL);
                        System.out.println(string1);
                        return time = rule(NORMAL,string1);

                    case EASY:
                        String string2 = getString(EASY);
                        System.out.println(string2);
                        return time = rule(EASY,string2);

                    default:
                        System.out.println("无此选项！");
                        break;
                }
            } else if (key == NO) {
                System.out.println("恭送大佬 ^_^ ");
                break;
            } else {
                System.out.println("输入错误！！");
            }
        }
        return 0;
    }

    private static long rule(int key , String string){

        Scanner input = new Scanner(System.in);
        System.out.println("准备好了吗？\n1、Yes\t\t2、No");
        if (YES == input.nextInt()){
            for (int i = 3; i >0; i--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("倒计时"+ i +"秒钟后开始");
            }
            System.out.println("开始计时：");
            return play(key,string);
        }else {
            System.out.println("欢迎下次再来！");
            return 0;
        }
    }

    //计时器
    private static long play(int key ,String string){
        Scanner input = new Scanner(System.in);
        long start = 0 ,end = 0;
        String s = null;
        start = System.currentTimeMillis();
        if (input.hasNext()){
            while (end == 0){
                s = input.nextLine();
                switch (key){
                    case HARD:
                        check(string, s);
                        break;
                    case NORMAL:
                        check(string, s);
                        break;
                    case EASY:
                        if (s.equalsIgnoreCase(string)){
                            end = System.currentTimeMillis();
                            System.out.println("恭喜你完成挑战！");
                        }else {
                            System.out.println("输入错误！");
                        }
                        break;
                }
            }
        }
        return  end - start;
    }

    private static void check(String string, String s) {
        long end;
        if (s.equals(string)){
            end = System.currentTimeMillis();
            System.out.println("恭喜你完成挑战！");
        }else {
            System.out.println("输入错误！请重新输入");
        }
        return;
    }

    //随机字符
    private static  String getString(int key ){
        StringBuffer buffer = new StringBuffer();
        switch (key){
            case HARD:
                //困难模式中要含有字符：~！@#￥%^&*（）{}[]\/.,<>?_-+= 33 -- 126
                for (int i = 0; i <30 ; i++) {
                    int a = (int) (Math.random() * (126 - 32) + 32);
                    char ch = (char) a;
                    buffer.append(ch);
                }
                System.out.println(buffer.toString());
                break;
            case NORMAL:

                //适中模式中，要含有大小写字母的变化 65 -- 90 97 --122
                for (int i = 0; i < 20; i++) {
                    char c = (char) (int) (Math.random() * 26 + 65);
                    char cc = (char) (int) (Math.random() * 26 + 97);
                    if (Math.random() >= 0.5){
                        buffer.append(c);
                    }else {
                        buffer.append(cc);
                    }
                }
                break;
            case EASY:
                // 简单模式中，有字母和数字即可 48 -- 57
                for (int i = 0; i < 10; i++) {
                    int a = (int) (Math.random() * 10 + 48);
                    int c = (int) (Math.random() * 26 + 65);
                    char cc = (char) c;
                    char aa = (char) a;
                    if (Math.random() >=0.5){
                        buffer.append(aa);
                    }else {
                        buffer.append(cc);
                    }
                }

                break;
        }
        return  buffer.toString();
    }

    //上传数据
    public  static void putScore(Person p , long score) throws IOException {
        URL url = new URL("http://192.168.20.194:8080/day16/first?"+ "nickname=" +p.getName()+"score="+ score);
        url.openConnection();
        System.out.println("游戏结束！");

    }

}
