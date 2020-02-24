package OracleConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnect {
    public static Connection getOracleConnection() throws SQLException{

        String hostName = "localhost";
        String sid = "orcl";
        String userName = "SYSTEM";
        String passWord = "123456";

        String connectionURL = "jdbc:oracle:thin:@" + hostName + ":1521:" + sid;
        Connection conn = DriverManager.getConnection(connectionURL, userName, passWord);

        return conn;
    }
}