package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasic02 {
    public static void main(String[] args) {

        //첫번째 줄에 입력값이 주어집니다.
        //이 입력값에 해당하는 횟수만큼 재입력 입니다.
        //이 입력값들 중에 가장큰 값을 찾으세요.
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();

        //배열의 선언
        int[] arr = new int[len];

        for(int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }

        //이 배열에서 큰값을 출력
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("큰값:" + max);


    }
}
