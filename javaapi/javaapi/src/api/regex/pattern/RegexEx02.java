package api.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {
    public static void main(String[] args) {

        String str1 = "123123-45644 GS25(치킨도시락) 4,400원";
        String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
        String str3 = "123456-3453 GS(갓혜자도시락) 6,000원";

        // 상품 번호, GS25, 상품명, 가격

        String p1 = "[0-9]{6}-[0-9]{4}";
        String p2 = "GS25|GS";
        String p3 = "\\([가-힣]+\\)";
        String p4 = "[0-9]+,[0-9]+원?";

        String[] arr = {str1, str2, str3};

        for (int i = 0; i < arr.length; i++) {
            Matcher m1 = Pattern.compile(p1).matcher(arr[i]);
            Matcher m2 = Pattern.compile(p2).matcher(arr[i]);
            Matcher m3 = Pattern.compile(p3).matcher(arr[i]);
            Matcher m4 = Pattern.compile(p4).matcher(arr[i]);

            if (m1.find() && m2.find() && m3.find() && m4.find()) {
                System.out.println(m1.group());
                System.out.println(m2.group());
                System.out.println(m3.group());
                System.out.println(m4.group());
                System.out.println();
            }
        }
    }
}

