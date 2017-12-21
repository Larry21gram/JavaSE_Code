package Main;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public interface ExecuteInter {
    Statement executte(Connection connection) throws SQLException;

}
