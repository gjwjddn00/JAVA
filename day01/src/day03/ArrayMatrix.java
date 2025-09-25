package day03;

import java.util.Arrays;

public class ArrayMatrix {
    public static void main(String[] args) {

        int[] kor = {50, 60, 70};
        int[] math = {40, 50, 60};
        int[] eng = {70,80,90};

        int[][] arr = {
                kor,
                math,
                eng
        };

        System.out.println(  Arrays.toString(arr)   );
        System.out.println(  Arrays.toString(arr[0])   );
        System.out.println(  Arrays.toString(arr[1])   );
        System.out.println(  Arrays.toString(arr[2])   );
        
        //2차원 배열의 사용
        arr[0][0] = 100;
        System.out.println( arr[0][0] ); //100
        System.out.println( arr[0][1] ); //60
        System.out.println( arr[0][2] ); //70

        //2차원 배열을 한번에 생성하고 초기화
        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        //2차원 배열의 크기만 지정하는 방법
        int[][] arr3 = new int[3][4];
        
        //2차원 배열을 한눈에 보는 기능
        System.out.println( Arrays.deepToString(arr3) ); //2차원배열 이름
        
        //2차원 배열의 순회
        int x = 1;
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++ ) {
                arr3[i][j] = x++;
            }
        }
        System.out.println( Arrays.deepToString(arr3) );


    }
}
