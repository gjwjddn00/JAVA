package day03;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {

        //이분할탐색(이진탐색)
        //선행조건 - 반드시 정렬되어 있어야함
        int[] arr = {1, 3, 4, 5, 10, 20, 25, 50, 80, 100};

        int find = 23; //찾을값
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            //중간값
            int mid = (start + end) / 2;
            //중간에 인덱스와 찾을값이 같은지 비교
            if(arr[mid] == find) {
                System.out.println("찾는값은:" + mid + "번째 있습니다");
                break;
            }

            //찾는값이 중간값보다 큰 경우 start를 중간값+1 로 올림
            if(arr[mid] < find) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //값이 교차했다면, 없음
        if(start > end) {
            System.out.println("찾는값은 없습니다");
        }


        //찾는값이 있으면 해당 인덱스를 알려줌, 없으면 음수값
        System.out.println( Arrays.binarySearch(arr, 25) );




    }
}
