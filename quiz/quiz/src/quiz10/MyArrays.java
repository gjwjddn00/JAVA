package quiz10;

import java.util.Arrays;

public class MyArrays {
    
    //1. 이 클래스를 외부에서 생성할 수 없도록, 생성자에 private을 붙임
    private MyArrays() {

    }
    //2. Arrays.toString() 메서드를 따라해보기
    //전달받은 배열의 요소를 [값, 값, 값] 형태로 문자열을 만들어서 반환
    public static String toStringArray(int[] arr) {
        //문자열 합
        String str = "[";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
            if(i == arr.length - 1) {
                break;
            }
            str += ", ";
        }
        str += "]";
        return str;
    }




}
