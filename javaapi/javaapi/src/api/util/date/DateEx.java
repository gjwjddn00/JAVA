package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
        //사람이 보기 편한 형태로 문자열로 포맷팅
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String now = sdf.format(date);
        System.out.println("현재시간:" + now );

        sdf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
        System.out.println( sdf.format(date) );


    }
}
