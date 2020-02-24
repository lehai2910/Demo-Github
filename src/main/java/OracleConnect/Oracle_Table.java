package OracleConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Oracle_Table extends StudentOrcl {
    public void rs_View () throws SQLException {
        Connection connection = OracleConnect.getOracleConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT MA_HOC_SINH, TEN_HOC_SINH, NGAY_SINH, EMAIL FROM HOCSINH";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            String maHS = resultSet.getString(1);
            String tenHS = resultSet.getString(2);
            String ngaySinh = resultSet.getString(3);
            String email = resultSet.getString(4);
            System.out.println("..........................");
            System.out.println("Mã Học Sinh = " + maHS);
            System.out.println("Tên Học Sinh = " + tenHS);
            System.out.println("Ngày sinh Học Sinh = " + ngaySinh);
            System.out.println("Email Học Sinh = " + email);
        }
    }
    public void rs_Update () throws SQLException{
        int soHS;
        System.out.println("nhập số hs");
        Scanner sc = new Scanner(System.in);
        soHS = sc.nextInt();
        for (int i = 1; i <= soHS; i++){
            ResultSet rs;
            Connection connection = OracleConnect.getOracleConnection();
            Statement statement = connection.createStatement();
            StudentOrcl studentOrcl = new StudentOrcl();
            studentOrcl.nhapThongTinHS();
            //System.out.println("INSERT INTO HOCSINH VALUES ("+"'"+student.getMaHS()+"'"+","+"'"+student.getTenHS()+"'"+","+"'"+student.getNgaySinh()+"'"+","+"'"+student.getEmail()+"'"+");");
            String sql = "INSERT INTO HOCSINH VALUES ("+"'"+studentOrcl.getMaHS()+"'"+","+"'"+studentOrcl.getTenHS()+"'"+","+"'"+studentOrcl.getNgaySinh()+"'"+","+"'"+studentOrcl.getEmail()+"'"+")";
            int rowCount = statement.executeUpdate(sql);
            System.out.println("Insert thành công " + rowCount);
        }
    }
    public void rs_Delete () throws SQLException{
        Scanner sc = new Scanner(System.in);

        System.out.print("Mã số học sinh cần xóa dữ liệu: ");
        setMaHS(sc.nextLine());
        Connection connection = OracleConnect.getOracleConnection();
        Statement statement = connection.createStatement();
        String sql = "DELETE FROM HOCSINH WHERE MA_HOC_SINH = " +"'"+getMaHS()+"'";
        statement.executeUpdate(sql);
        rs_View();
    }
}
