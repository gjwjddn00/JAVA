package day04;

import java.util.Arrays;

public class MethodEx04 {
    public static void main(String[] args) {

        //배열을 매개변수로 전달받거나, 배열을 반환하는 메서드?? yes
        //변수명으로 전달
        int[] arr = {1,2,3};
        some(arr);

        String[] result = sayHello();
        System.out.println(Arrays.toString(result));

        int[] newArr = reverseArray(arr);
        System.out.println(Arrays.toString(newArr));
    }

    //매개변수로 배열받는 메서드
    static void some(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    //배열을 반환하는 메서드
    static String[] sayHello() {

        String[] arr = {"Hello", "World"};

        return arr;
    }
    // - 매개변수: arr
    // - 반환값: 배열 (뒤집힌 새 배열)
    // - 배열을 받아서 순서를 뒤집은 새 배열을 반환하는 함수 reverseArray를 만들어보세요.
    // - 예시:[1, 2, 3, 4] → [4, 3, 2, 1]

    static int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[arr.length - i - 1];
        }
        return newArr;
    }

}
