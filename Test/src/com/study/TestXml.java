package com.study;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestXml {
    public static void main(String[] args) throws IOException, DocumentException {
        Person person = new Person("lili","lairui","201314k","Worker");

        // 按照用户名分不同的person，所以用户名设置为person标签的属性。

        output(person);

        Tool.write(person);
    }

    private static void output(Person person) throws IOException {
        String job = person.getJob().getClass().getName();
        String name = person.getName().getClass().getName();
        String user = person.getUser().getClass().getName();
        String passworld = person.getPassworld().getClass().getName();

        Document document = DocumentHelper.createDocument();
        Element root = document.addElement(person.getClass().getSimpleName());
        Element userE = root.addElement(user);
        userE.addText(person.getUser());
        Element nameE = root.addElement(name);
        nameE.addText(person.getName());
        Element passworldE = root.addElement(passworld);
        passworldE.addText(person.getPassworld());
        Element jobE = root.addElement(job);
        jobE.addText(person.getJob());

        XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/data.xml"));
        xmlWriter.write(document);
        xmlWriter.close();
    }
}
