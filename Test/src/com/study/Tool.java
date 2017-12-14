package com.study;

import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.List;

public class Tool {

    private static void readAll() throws DocumentException, FileNotFoundException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(new FileReader("C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Test\\src\\data.xml"));

        Element rootElement = document.getRootElement();
        getAll(rootElement);
    }

    // 获得该标签及以下的标签属性及文本内容
    public static void getAll(Element root){
        //root所有属性
        List<Attribute> attributes = root.attributes();
        for (Attribute attribute : attributes) {
            System.out.println(root.getName()+"的" + attribute.getName()+ "属性的值为："+ attribute.getValue());
        }

        // 文本
        System.out.println(root.getName()+"的文本内容为：" + root.getText());

        // 所有子标签
        List<Element> elements = root.elements();
        for (Element element : elements) {
            if (element != null){
                getAll(element);
            }
        }
    }

    // 重新写入
    public static void write (Person person) throws IOException, DocumentException {

        SAXReader reader = new SAXReader();
        Document document = reader.read(new FileReader("C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Test\\src\\data.xml"));

        Element rootElement = document.getRootElement();

        Element person1 = rootElement.addElement("person");

             person1.addAttribute("user",person.getUser());
             Element name = person1.addElement("name");
             Element passworld = person1.addElement("passworld");
             Element job = person1.addElement("job");
             name.addText(person.getName());
             passworld.addText(person.getPassworld());
             job.addText(person.getJob());

             XMLWriter writer = new XMLWriter(new FileWriter("C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Test\\src\\data.xml"));
             writer.write(document);
             writer.close();

    }

}

