package goals;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueriesGoals {
    public static ResultSet executeSelect(String selectQuery){
        try {
            Connection connection = MysqlConnect.connect();
            Statement statement = connection.createStatement();
            return statement.executeQuery(selectQuery);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }


    public static void executeUpdate(String update){
        try {
            Connection connection = MysqlConnect.connect();
            Statement statement = connection.createStatement();
            statement.executeUpdate(update);
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
