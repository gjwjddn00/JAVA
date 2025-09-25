package day02;

import java.util.Scanner;

public class MultiForEx {
    public static void main(String[] args) {

        /*
        입력받은 수까지의 정수중에서 소수의 합계
        소수 = 약수가 1과 자기자신인 수
        입력: 10
        2(소수) + 3(소수) + 5 + 7
        
        바깥반복문은 10까지
        내부반복문은 i의 약수의 개수
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("입력>");
        int num = scan.nextInt();

        int sum = 0;

        for(int i = 1; i <= num; i++){
            int cnt = 0;
            //각 i의 약수의 개수
            for(int j = 1; j <= i; j++) {
                if(i % j == 0){
                    cnt++;
                }
            }

            if(cnt == 2) {
                sum += i;
            }
        } //end for

        System.out.println("입력받은 수까지 소수의 합:" + sum);



        
    }
}
