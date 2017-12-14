package Tools;

import com.except.NoPersonException;
import com.loginandregister.Person;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    public static void translate (){

    }

}
