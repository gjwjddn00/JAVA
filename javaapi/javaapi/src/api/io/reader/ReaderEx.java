package api.io.reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) {


        try {

            Reader in = new FileReader("C:\\Users\\user\\Desktop\\course\\upload\\text.txt");

            while(true) {
                int result = in.read(); //더이상 읽을 데이터가 없다면 -1을 반환
                if(result == -1) {
                    break;
                }
                System.out.print( (char)result );
            }

            in.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
