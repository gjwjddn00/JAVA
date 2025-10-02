package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

//        int temp = x;
//        x = y;
//        y = temp;

        //두 수를 입력 받아서 받은 인덱스번째의 위치를 swap
        int[] arr = {1,2,3,4,5};

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        //자리변경
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        System.out.println(Arrays.toString(arr));




    }
}
