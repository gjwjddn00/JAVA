package api.io.buffered;

import java.io.*;

public class 빠른입출력 {
    public static void main(String[] args) {



        //입출력
        try {

            //빠른입력
            Reader rd = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(rd);

            String str = br.readLine(); //입력받은 데이터를 읽음

            //빠른출력
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            bw.write(str); //출력
            bw.flush();

            br.close();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
