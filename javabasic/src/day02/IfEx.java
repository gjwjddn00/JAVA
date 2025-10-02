package day02;

import java.util.Scanner;

public class IfEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("점수입력>");
        int point = scan.nextInt();

        String grade = "F";

        if(point >= 90) {
            grade = "A";
        } else if(point >= 80) {
            grade = "B";
        } else if(point >= 70) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("당신의 점수는:" + point + ", 학점은:" + grade);


//        if(point >= 60) {
//            System.out.println("합격");
//        } else {
//            System.out.println("불합격");
//        }

        
        
        
        
    }
}
