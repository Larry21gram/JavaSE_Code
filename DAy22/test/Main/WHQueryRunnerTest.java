package Main;

import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class WHQueryRunnerTest {

    @Test
    public  void queryByParams() throws SQLException {

        /**
         * 根据需求类型，选择ResultSetHandler实现类
         * 结果集：
         * 单行行列：new ScalarHandler<T>()
         * 对象： new BeanHandler<User>(User.class)
         * 对象集: new BeanListHandler<User>(User.class)
         * Map: new MapHandler()
         * Map集合：  new MapListHandler()
         * 数组: new ArrayHandler()
         * 数组集: new ArrayListHandler()
         */

        /**
         * Number类 ，可以接收任何数值型值， 有各种获取整形的方法
         */
        Long query = new WHQueryRunner().query(
                Jdbc_Util.getConnection(), "select count(*) from hw_user ", new ScalarHandler<Long>(),"李小龙"
        );

        Number number = query;
        int i = number.intValue();
        System.out.println(i);
    }

    @Test
    public  void  queryBean() throws SQLException {
        List<User> user = new WHQueryRunner().query(
                Jdbc_Util.getConnection(),"select * from hw_user",new BeanListHandler<User>(User.class)
        );
        for (User user1 : user) {
            System.out.println(user1);
        }
    }

    @Test
    public  void queryMap() throws SQLException {
        Map<String, Object> query = new WHQueryRunner().query(
                Jdbc_Util.getConnection(), "select * from hw_user", new MapHandler()
        );
        System.out.println(query.toString());
    }
}