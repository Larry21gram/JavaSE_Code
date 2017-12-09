package com;

import com.code.Person;
import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataTool {

    private static SAXReader reader = new SAXReader();
    private static Document document = null;
    private static XMLWriter xmlWriter = null;

    private  static  String name = null ;
    private  static  String user = null;
    private  static  String passworld = null;
    private  static  String job = null;

    //读取路径
    public static void getXmlAddress() throws DocumentException {
        document = reader.read(new File("C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Homework_About_Demo\\src\\DataOfUser"));
    }

    //读取xml ( 用户名，及密码获得)

    // 写入路径
    public static  String putXmlAddress(){
        //创建写入对象
        return "C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Homework_About_Demo\\src\\DataOfUser";
    }

    //写入
    public static void outPutTool() throws IOException {
        // 创建输出对象

        //设置编码
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        // 创建文件地址
        xmlWriter = new XMLWriter(new FileWriter(putXmlAddress()),outputFormat);
        xmlWriter.write(document);

        // 关闭输出流，将内容写到目标文件中
        xmlWriter.close();
    }

    //写入Xml
    public static void addXml(Person person) throws IOException {

        document = DocumentHelper.createDocument();
        // 添加根标签
        Element root = document.addElement("Person");

        //添加子标签
        Element user = root.addElement("user");
        user.addText(person.getUser());

        Element name = root.addElement("name");
        name.addText(person.getName());

        Element passworld = root.addElement("passworld");
        passworld.addText(person.getPassworld());

        Element job = root.addElement("job");
        job.addText(person.getJob());

        System.out.println("注册成功：\n姓名：" + person.getName()+ "\t\t职业：" + person.getJob());
        outPutTool();
    }
}
