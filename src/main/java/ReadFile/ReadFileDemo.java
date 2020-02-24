package ReadFile;

import java.io.*;

public class ReadFileDemo {
    public static void main(String[] args) {
        //readFileDemo();
        writeFileDemo();
    }
    public static void readFileDemo (){
        String path = "E:\\download\\Baigiang\\mytext.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int i;
            while ((i = fileInputStream.read()) != -1){
                System.out.print((char) i );
            }
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeFileDemo (){
        String path = "E:\\download\\Baigiang\\mytextwrite.txt";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            String s = "This is my write String\nchúc mừng bạn";
            byte b[] = s.getBytes();
            fileOutputStream.write(b);
            System.out.print("file đã được ghi thành công ");

            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  /*  public static void  bufferReader (){
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("file"))
    }*/
}
