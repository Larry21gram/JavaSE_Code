package com.lanou3g.study.study;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {

    static  SAXReader reader = new SAXReader();

    // 获得读取文件
   static Document document = null;

   static   List<Student> list = new ArrayList<>();
    public static void main(String[] args) throws DocumentException {

       document =  reader.read(new File("C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Day13\\src\\data.xml"));

//        listElements();

        //all(document.getRootElement());

        getStudent(document.getRootElement());
        System.out.println(Arrays.toString(list.toArray()));

    }
    public  static void  all(Element element){

        List<Attribute> attributes = element.attributes();

        for (int i = 0; i < attributes.size(); i++) {
            Attribute attribute = attributes.get(i);

            System.out.println("属性：" + attribute.getName() + " 属性值：" + attribute.getValue());
        }

        // 获得文本
        String string = element.getText();

        System.out.println( element.getName() + "元素文本：" + string );

        List<Element> elements = element.elements();

        //没有zibiaoqian
        if (elements.size() == 0){
            return ;
        }

        for (int i = 0; i < elements.size(); i++) {
            Element element1 = elements.get(i);

            all(element1);
        }

    }

    public static void listElements() throws DocumentException {
        //获得文件对象

        Element rootElement = document.getRootElement();
        //获得所有标签
        List<Element> elements = rootElement.elements();

        Element student = rootElement.element("student");
        Attribute attribute = student.attribute("name");
        String name = attribute.getName();
        String value = attribute.getValue();

        Student student1 = new Student(name, Integer.parseInt(value));
        //遍历所有标签
        for (int i = 0; i < elements.size(); i++) {
            //获得单个标签
            Element element = elements.get(i);
        }
    }

    public static void getStudent(Element element){

        //获得所有属性
        List<Attribute> attributes = element.attributes();

        //遍历所有属性
        for (Attribute s : attributes) {
            System.out.println("属性名：" + s.getName() + "属性值：" + s.getValue());
            Student student = new Student(s.getValue(), 0);
            list.add(student);
        }

        // 获得所有子标签
        List<Element> elements = element.elements();
        if (elements == null){
            return;
        }
        for (Element e: elements) {
            getStudent(e);
        }

    }
}
