package quiz14;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        /*
        업, 다운 게임
        1~100까지 랜덤한 정답을 만들고, 사용자에게 정답을 맞출 때까지 입력받는 프로그램입니다.
        
        한글을 입력하더라도 정상적으로 돌아갈 수 있도록 예외처리 진행합니다.

        한글을 입력하면 무한루프를 돌게 되는데, 그 해결방법은 찾아보세요.
         */
        Scanner scan = new Scanner(System.in); //스캐너
        int correct = (int)(Math.random() * 100) + 1; // 1~100까지 랜덤한 정답
        int count = 0; //정답횟수

        while(true) {
            try {

                System.out.print("1과 100사이의 값을 입력하세요>");
                int answer = scan.nextInt(); //정수
                count++; //시도횟수 증가

                if(answer < correct) {
                    System.out.println("더 큰수를 입력하세요");
                } else if(answer > correct) {
                    System.out.println("더 작은 수를 입력하세요");
                } else {
                    System.out.println("정답입니다");
                    System.out.println("시도 횟수는:" + count);
                    break;
                }
            } catch (Exception e) {
                System.out.println("숫자를 입력하세요.");
                scan.nextLine(); //next() nextLine() 엔터키코드를 포함해서 입력 받아줌
            }
        }

    }
}
