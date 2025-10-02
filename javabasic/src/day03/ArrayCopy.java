package day03;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        //복사
        //복사의 개념 2개
        //얕은복사 - 주소값을 복사 (원본값도 같이 변경) 
        //깊은복사 - 완전히 새로운 배열을 하나 생성
        int[] arr = {10, 20, 30, 40, 50};

//        int[] newArr = arr;
//        System.out.println(arr == newArr);
//        System.out.println(Arrays.toString(newArr));
//        newArr[0] = 100;
//        arr[4] = 500;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(newArr));

        //깊은복사
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println("사본배열:" + Arrays.toString(newArr) );

        //깊은복사
        int[] newArr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("사본배열:" + Arrays.toString(newArr2) );


    }
}
