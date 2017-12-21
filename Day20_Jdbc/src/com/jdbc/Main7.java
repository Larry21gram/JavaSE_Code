package com.jdbc;

import java.sql.PreparedStatement;

public class Main7 {
    public static void main(String[] args) {
        /**
         * JDBC的事务
         * 原子性、一致性、隔离性 、持久性 (ACID )
         */

        Jdbc_Util.execute(connection -> {
            //设置为false表示手动提交。 也就是开启了事务。
            try {
                connection.setAutoCommit(false);
                PreparedStatement preparedStatement = connection.prepareStatement("DELETE from hw_user WHERE  uname = ?");
                preparedStatement.setString(1,"zhangsan");
                preparedStatement.execute();

                Class.forName("");

                preparedStatement.setString(1,"LiSi");
                preparedStatement.execute();

                //提交
                connection.commit();
                return preparedStatement;
            } catch (ClassNotFoundException e) {
                //回滚，取消。
                connection.rollback();
            }
            return  null;
        });
    }
}
