package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/homw", "root", "123");
        Statement statement = connection.createStatement();

        int i = statement.executeUpdate("INSERT  into hw_user VALUES (NULL ,'张一山',40,'北京')");
        System.out.println(i);


    }
}
