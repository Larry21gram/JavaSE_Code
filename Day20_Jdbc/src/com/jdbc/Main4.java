package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main4 {
    public static void main(String[] args) {

        /** 接口回调写法*/

        //通用Jdbc_Util 加载进内存时，也会执行静态块
//        执行静态方法execute，传入接口的匿名对象，
        Jdbc_Util.execute(new ExecuteInter() {

            // 直接使用接口作为引用类型的参数时，实际是传入的接口的匿名内部类对象。
            // new ExecuteInter() 实际是声明内部类匿名对象。
            @Override
            public Statement executte(Connection connection) throws SQLException {

                   Statement statement = connection.createStatement();

                   String sql = "select * from hw_user";
                   ResultSet rs = statement.executeQuery(sql);

                   Jdbc_Util.showResult(rs);
                   return statement;
            }
        });
    }


}
