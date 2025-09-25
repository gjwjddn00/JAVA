package day04;

import java.util.Arrays;

public class MethodEx03 {
    public static void main(String[] args) {
        //Queue - FIFO(first in first out)
        //offer - 뒤에서 추가, poll - 앞에서 제거
        offer(10);
        offer(20);
        offer(30);
        System.out.println(Arrays.toString(arr));

        System.out.println( poll() ); //10
        System.out.println( poll() ); //20
        System.out.println( poll() ); //30
        System.out.println( poll() ); //0

        System.out.println(Arrays.toString(arr));
    }

    static int[] arr = {};
    static int offer(int data) {
        //배열의 크기를 +1 인 배열을 만들고, 데이터를 옴겨담고, 마지막에 추가
        int[] temp = new int[arr.length + 1];

        //기존 배열의 값을 temp에 저장함
        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        //temp의 마지막에 data를 추가
        temp[temp.length - 1] = data;
        //arr를 temp로 변경
        arr = temp;
        temp = null; //삭제

        return data; //추가된 데이터를 반환
    }
    static int poll() {
        //삭제할 데이터 백업, 크기가 -1 인 배열 만들고, temp[0] = arr[1]
        if(arr.length > 0) {
            //삭제할 데이터
            int del = arr[0];
            //크기가 -1인 배열
            int[] temp = new int[arr.length - 1];
            //arr의 첫번째 부터 옴겨담는다.
            for(int i = 0; i < temp.length; i++) {
                temp[i] = arr[i + 1];
            }
            //arr를 temp로 변경
            arr = temp;
            temp = null;
            return del;
        }
        return 0;
    }

}
