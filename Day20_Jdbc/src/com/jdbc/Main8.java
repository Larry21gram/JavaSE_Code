package com.jdbc;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main8 {

    public static final QueryRunner QUERY_RUNNER = new QueryRunner();

    public static void main(String[] args) throws SQLException {
        //dbUtil是apache公司提供的工具类
        //询问执行。
        String sql = "select * from hw_user";

        Object query = QUERY_RUNNER.query(Jdbc_Util.getConnection(), sql, new ResultSetHandler<List<User>>() {
            @Override
            public List<User> handle(ResultSet resultSet) throws SQLException {
                //todo 把resultSet中的数据封装到对象中。
                List<User> users = new ArrayList<>();
                while (resultSet.next()) {
                    User user = new User();
                    user.setId(resultSet.getInt(1));
                    user.setName(resultSet.getString(2));
                    user.getAge(resultSet.getInt(3));
                    user.setLoc(resultSet.getString(4));
                    users.add(user);
                }
                return users;
            }
        });
        System.out.println(query);
    }
}
