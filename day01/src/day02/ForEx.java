package day02;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {
        //입력받은 구구단을 출력

        Scanner scan = new Scanner(System.in);
        System.out.print("구구단:");
        int dan = scan.nextInt();

        for(int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + dan*i);
        }


    }
}
