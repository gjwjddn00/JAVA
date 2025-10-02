package quiz15;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //백준 - 문자열 9086번

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 1; i <= num; i++){
            String str = scan.next();
            System.out.println( "" + str.charAt(0) + str.charAt( str.length() - 1) );
        }


    }
}
