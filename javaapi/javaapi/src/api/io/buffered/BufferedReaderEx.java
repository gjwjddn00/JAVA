package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
    public static void main(String[] args) {


        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\course\\upload\\bye.txt") );

            //System.out.println( br.readLine() ); //한줄읽기

            String str;
            while( (str = br.readLine()) != null ) {
                System.out.println(str);
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
