package quiz01;

import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();

        int[] arr = new int[len];

        for(int i = 0; i < arr.length; i++)  {
            arr[i] = scan.nextInt();
        }

        //값을 찾음
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        System.out.println(min + " " + max);



    }
}
