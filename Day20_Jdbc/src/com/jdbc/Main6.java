package com.jdbc;

import java.sql.PreparedStatement;

public class Main6 {
    public static void main(String[] args) {

        // {} 就是匿名内部类实现ExecuteInter接口，直接覆写方法体。connection 是参数。
        Jdbc_Util.execute(connection -> {

            PreparedStatement preparedStatement = connection.prepareStatement("INSERT  into hw_user VALUES (NULL ,'zhangsan',29,'上海' )");

            // 添加批处理:一次处理多条语句。
            preparedStatement.addBatch("INSERT  into hw_user VALUES (NULL ,'Lisi',25,'武汉' )");
            preparedStatement.addBatch("INSERT  into hw_user VALUES (NULL ,'zhangsan',29,'上海' )");
            preparedStatement.executeBatch();
            return preparedStatement;
        });
    }
}
