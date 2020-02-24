package OracleConnect;

import java.sql.Connection;
import java.sql.SQLException;

public class TextOracle extends Oracle_Table{
    public static void main(String[] args) throws SQLException {
        Oracle_Table oracle_table = new Oracle_Table();
        oracle_table.rs_Update();
        oracle_table.rs_View();
    }
}
