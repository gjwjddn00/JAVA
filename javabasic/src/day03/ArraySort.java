package day03;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        
        //정렬 - 선택정렬 (가장작은 값을 앞으로 가져옴)
        int[] arr = {5, 23, 1, 43, 200, 100, 40};
        //첫번째 - 1, 23, 5, 43, 200, 100, 40
        //      - 1, 5, 23, 43, 200, 100, 40
        //      - 1, 5, 23, 43, 200, 100, 40
        //      - 1, 5, 23, 40, 200, 100, 43
//        for (int i = 0; i < arr.length - 1; i++) { //첫번째 비교대상
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }


        Arrays.sort(arr); //정렬끝~ ㅎㅎ
        System.out.println( Arrays.toString(arr) );




    }
}
