package com.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Jdbc_Util {
    static{
        try {

            Properties p = new Properties();
            p.load(new FileReader("src/jdbc.propertice"));

            String driverName = p.getProperty("driverName");
            url = p.getProperty("url");
            database = p.getProperty("database");
            user = p.getProperty("user");
            password = p.getProperty("password");
            Class.forName(driverName);

        } catch (ClassNotFoundException e) {
                   e.printStackTrace();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage()+"\n\t\t" +
                    "请将配置文件jdbc.propertice放置到src目录下");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String url;
    private static String database;
    private static String user;
    private static String password;

    public  static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(url + database ,user,password);
            return connection ;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 优化
    public  static void execute(ExecuteInter inter){
        try {
            Connection connection = DriverManager.getConnection(url + database ,user,password);
            inter.executte(connection);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void showResult(ResultSet rs) throws SQLException {
        while (rs.next()){
            System.out.print(rs.getString(1)+"\t\t");
            System.out.print(rs.getString(2)+"\t\t");
            System.out.print(rs.getString(3)+"\t\t");
            System.out.print(rs.getString(4)+"\t\t");
            System.out.println();
        }
    }
}
