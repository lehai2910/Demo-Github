package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
    demoDateFormatToString();
    }


    public static void demoDate (){
        Date d = new Date();
        Date d1 = new Date();
        Date d2 = new Date();
        System.out.println("Ngày giờ hiện tại: "+ d);
        System.out.println("Ngày sau 1/1/1970 "+ d1);
        System.out.println(d.compareTo(d1));
    }
    public  static void demoDateFormat (){
        String s = "2019-01-28";
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
    }
    public  static void demoDateFormatToString (){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String s = sdf.format(d);
        System.out.println(s);
    }

}
