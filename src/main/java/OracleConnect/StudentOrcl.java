package OracleConnect;

import java.util.Scanner;

public class StudentOrcl {
    private String maHS;
    private String tenHS;
    private String ngaySinh;
    private String email;

    public StudentOrcl() {
        super();
    }

    public StudentOrcl(String maHS, String tenHS, String ngaySinh, String email) {
        super();
        this.maHS = maHS;
        this.tenHS = tenHS;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void nhapThongTinHS (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin học sinh ");
        System.out.print("Nhập mã học sinh: ");
        maHS = sc.nextLine();
        System.out.print("Nhập tên học sinh: ");
        tenHS = sc.nextLine();
        System.out.print("Nhập ngày sinh học sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập email học sinh: ");
        email = sc.nextLine();
    }
}
