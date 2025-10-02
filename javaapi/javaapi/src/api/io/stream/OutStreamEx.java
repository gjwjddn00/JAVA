package api.io.stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutStreamEx {
    public static void main(String[] args) {

        //FileOutputStream out = new FileOutputStream("파일을 쓸 경로");

        OutputStream out = null;

        try {
             out = new FileOutputStream("C:\\Users\\user\\Desktop\\course\\upload\\hello.txt");
             String str = "hello world";
             out.write(str.getBytes()); //파일을 써내림 (byte기반으로)

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch(Exception e) {}
        }




    }
}
