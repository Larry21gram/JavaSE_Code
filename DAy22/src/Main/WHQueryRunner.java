package Main;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.Connection;
import java.sql.SQLException;

public class WHQueryRunner extends QueryRunner{
    // 对已知类进行扩展。
    @Override
    public <T> T query(Connection conn, String sql, ResultSetHandler<T> rsh) throws SQLException {
        //todo 开启事务
        conn.setAutoCommit(false);

        T t =  super.query(conn, sql, rsh);
        // todo 提交事务
        conn.commit();
        conn.close();
        //
        return t ;
    }

}
