package api.util.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateEx {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //날짜 포멧형식을 변경
        String result = now.format(  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") );
        System.out.println(result);

        //타임존 개념 -> 세계의 시간타입 지정
        LocalDateTime localDateTime = LocalDateTime.now( ZoneId.of("Asia/Shanghai") );
        System.out.println(localDateTime);

    }
}
