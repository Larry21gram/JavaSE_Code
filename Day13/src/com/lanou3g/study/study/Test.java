package com.lanou3g.study.study;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Test {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new File("C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Day13\\src\\data.xml"));
        //获得根标签
        Element rootElement = document.getRootElement();
        //获得根标签的文本
        String text = rootElement.getText();

        List<Attribute> attributes = rootElement.attributes();

        for (Attribute a: attributes) {
            // 获得所有标签属性名
            String name = a.getName();
        }
    }

}
