package encrypt;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class Encrypt {
    /**
     * 文件加密工具类
     * 得到 一个文件，进行最底层加密
     * 进行IO流的写入与写出
     * 并实现XML、硬盘 、网页的数据流通
     */
    private static StringBuffer buffer = null;
    private static String address = "C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Test\\src\\date\\XmlDate";

    //建立xml转化工具对象
    private  static SAXReader reader = new SAXReader();
    //建立xml文件对象
    private static Document document = null;

    static {
        try {
            document = reader.read(new File(address));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws DocumentException, FileNotFoundException {

    //实现文件加密并序列化到硬盘。

        //获得根标签
        Element rootElement = document.getRootElement();
        //获得所有
        getInfo(rootElement);

        //建立shuchul
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\lanou\\Desktop\\测试\\copy.txt"));
    }

    private static void getInfo(Element rootElement) {
        // 以“｛标签名：标签内容 | ”表示标签
        buffer.append("{ "+rootElement.getName()+":"+rootElement.getText() + "|");

        // 获得跟标签属性，如果有属性
        List<Attribute> attributes = rootElement.attributes();
        for (Attribute attribute : attributes) {
            if (attribute != null){

                //以[属性名：属性值]的形式储存属性
                buffer.append("["+ attribute.getName()+":" +attribute.getValue()+"] }");
            }
        }

        //获得子标签
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            if (element != null){
                getInfo(element);
            }
        }
    }

}
