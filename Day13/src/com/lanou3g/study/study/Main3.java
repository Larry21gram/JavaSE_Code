package com.lanou3g.study.study;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import javax.sql.rowset.spi.XmlReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {

    public static void main(String[] args) throws IOException {

        // 创建Document对象
        Document document = DocumentHelper.createDocument();
        //创建标签元素： 名字为students 并返回给element
        Element element = document.addElement("students");

        // 添加子标签
        Element element1 = element.addElement("student");
        //添加文本并自动添加结束标签
        element1.addText("我是张三的文本");
        // 添加子标签属性及内容。
        element1.addAttribute("name","zhangSan");
        //写出文本
        element.addText("我是一丢学生");

        // 例：
        Element score = element1.addElement("score");
        score.addText("200");
        score.addAttribute("name","成绩");

        // 设置输出编码。
        OutputFormat outputFormat = OutputFormat.createPrettyPrint();
        outputFormat.setEncoding("utf-8");

        // 创建文件地址
        XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/output.xml"),outputFormat);
        xmlWriter.write(document);

        // 关闭输出流，将内容写到目标文件中
        xmlWriter.close();
    }
}
