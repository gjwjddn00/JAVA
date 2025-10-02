package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileCopyEx {
    public static void main(String[] args) {

        try {

            String path = "C:\\Users\\user\\Desktop\\course\\upload\\image.png";
            String path2 = "C:\\Users\\user\\Desktop\\course\\upload\\image2222.png";

            InputStream in = new FileInputStream(path);
            OutputStream out = new FileOutputStream(path2);

            byte[] arr = new byte[1024];
//            int result = in.read(arr); //읽어들인 길이
//            System.out.println("읽어들인 길이:" + result );
//            System.out.println( Arrays.toString(arr) );
            int result;
            while( (result = in.read(arr) )  != -1 ) {
                out.write(arr,0,result); //배열, 시작값, 끝값
            }

            in.close();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
