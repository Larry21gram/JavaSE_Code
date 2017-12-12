package com.lanou3g.study.study;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DocumentException {
        //用来将xml文件弄到Java的工具类
        SAXReader saxReader = new SAXReader();

        // File： 文件
        //括号中的字符串，是要找的文件的文件路径。
        Document document = saxReader.read(new File("C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Day13\\src\\data.xml"));

        //获得根标签 即最外层标签。
        Element rootElement = document.getRootElement();

        // 获得所有标签名
        List elements = rootElement.elements();

        // 获取某标签的子标签 "student"：标签名
        Element student = rootElement.element("student");

        // 所有属性
        List attributes = student.attributes();
        System.out.println();
        // 获取标签内的属性
        Attribute name = student.attribute("name");

        //获得属性值。
        String value = name.getValue();
        System.out.println(value);
    }
}
