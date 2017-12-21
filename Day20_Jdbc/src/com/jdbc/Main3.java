package com.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main3 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");

        String s = "jdbc:mysql://localhost:3306/homw " + "?user=root&password=123";

        Properties properties = new Properties();

        FileReader reader = new FileReader("C:\\Users\\lanou\\Desktop\\JavaSE_Code\\Day20_Jdbc\\src\\com\\jdbc\\db.propertice");
        properties.load(reader);

        Connection connection = DriverManager.getConnection(s, properties);

        Statement statement = connection.createStatement();

        String u = "update hw_user set uname='LiErGou',where uname='张一山'";
        statement.execute(u);

        statement.close();
        connection.close();

    }
}
