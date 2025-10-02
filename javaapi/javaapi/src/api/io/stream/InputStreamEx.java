package api.io.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx {
    public static void main(String[] args) {

        //1바이트 기반이기 때문에 텍스트 데이터를 읽거나 쓰는데는 한계점이 있음.
        //파일 데이터를 읽고 쓸때 사용함

        try {

            //바로 선언
            InputStream in = new FileInputStream("C:\\Users\\user\\Desktop\\course\\upload\\hello.txt");

            while(true) {
                int a = in.read(); //더이상 읽을 데이터가 없으면 -1 반환
                if(a==-1) {
                    break;
                }
                System.out.print( (char)a );
            }

            in.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
