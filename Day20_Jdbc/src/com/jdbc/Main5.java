package com.jdbc;

import java.sql.*;

public class Main5 {
        /**
         * 1 PreparedStatement 可以使用动态参数
         *      statement只能使用静态
         * 2、防止sql注入。
         *      "SELECT * from hw_user WHERE  loc=?" + "AND age > ?"
         *      String user = "zhang";
         *      String password = "123";
         *      "SELECT * from hw_user WHERE  user = " + user + "and password = " + password
         *  如果 String user = " 1 or 1=1";则拼上去就会失去判断意义，
         *  因为永远正确（拼接结果：user =1 or 1=1），这就是sql注册。

         */
    public static void main(String[] args) {

        Jdbc_Util.execute(connection -> {
            try {
                /** 预处理查询语句 */
                PreparedStatement preparedStatement =
                        connection.prepareStatement("SELECT * from hw_user WHERE  loc=?" +
                                "AND age > ?");
                preparedStatement.setString(1,"北京");
                preparedStatement.setInt(2,20);

                ResultSet resultSet = preparedStatement.executeQuery();
                Jdbc_Util.showResult(resultSet);
                return preparedStatement;

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        });
    }
}
