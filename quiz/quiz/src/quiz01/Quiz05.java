package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //배열의 크기
        int m = scan.nextInt(); //바꿀횟수

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        //교환할 횟수
        for(int j=1; j <= m; j++){
            int a = scan.nextInt() - 1;
            int b = scan.nextInt() - 1;

            int temp = arr[a];
            arr[a] =  arr[b];
            arr[b] = temp;
        }

        //출력을 위한 반복
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }




    }
}
