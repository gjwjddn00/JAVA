package day02;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("점수입력>");
        int point = scan.nextInt(); //1~100가정

        //switch구문의 () 에는 변수, 변수의 연산식이 들어갑니다.
        switch (point / 10) {
            case 9:
                System.out.println("A등급");
                break; //switch문을 탈출함
            case 8:
                System.out.println("B등급");
                break;
            case 7:
                System.out.println("C등급");
                break;
            default:
                System.out.println("F등급");
                break;
        }


    }
}
