package Exception;
import javafx.scene.chart.ScatterChart;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // đây là 1 Stream
        System.out.println("Nhap so bi chia");
        int x = sc.nextInt();
        System.out.println("Nhap so chia");
        int y = sc.nextInt();
        Integer [] i = new Integer[2];
        i[0] = 1;
        i[1] = 2;
        try {
            double ketQua = x/y;
            System.out.println("Ket quả = " + ketQua);

            System.out.println("in kết quả mãng i 3 " + i[3]);
        } catch (java.lang.ArithmeticException e){
            System.out.println("Loi chia cho 0 ");
            //java sẽ bỏ qua khi catch lỗi chia cho 0, và ko bắt lỗi array bỏ qua đến bước cuối
            // nếu phép chia ko lỗi mới bị lội array
        } catch (java.lang.Exception e){

        }
        //System.out.println("in kết quả mãng i 3 " + i[3]);
        System.out.println("thành công");
        //double ketQua = x/y;
        //ko ép kiểu double phía trước sẽ in ra kết quả 0.0
        // vì kết quả đưa vào bộ nhớ tạm, ra kết quà theo kiểu Int là 0 => double 0.0
        //System.out.println("Ket quả = " + ketQua);
    }
}
