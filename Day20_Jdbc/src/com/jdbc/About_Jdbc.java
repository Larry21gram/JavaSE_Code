package com.jdbc;

import java.sql.*;

public class About_Jdbc {
    /**
     * JDBC 数据库连接规范。
     * mysql-connector-java-5.1.18-bin.jar为驱动架包
     * 不同的数据库使用不同的架包即可。
     */
    public static void main(String[] args) throws SQLException {
        //注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //获得连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/homw", "root", "123");
        System.out.println(connection.getClass().getName());

        //找个对象给我们干活 statement:用于声明执行的sql语句。
        Statement statement = connection.createStatement();

        //执行sql语句， 返回ResultSet (结果集)  类型数据，里面是表。
        String sql = "select * from hw_user";
        ResultSet resultSet = statement.executeQuery(sql);

        //取出数据
        while(resultSet.next()){
            System.out.print(resultSet.getInt(1) + "\t\t");
            System.out.print(resultSet.getString(2) + "\t\t");
            System.out.print(resultSet.getString(3) + "\t\t");
            System.out.print(resultSet.getString(4) + "\t\t");
            System.out.println();

        }

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
        }

        //关闭资源
        resultSet.close();
        statement.close();
        connection.close();

    }
}
