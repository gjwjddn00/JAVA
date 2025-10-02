package day03;

public class ArrayBasic {

    public static void main(String[] args) {

        //배열은 인덱스를 가지고 있어서, 순서대로 값의 접근
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        //i는 인덱스번호
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i]; //배열안에 있는 요소의 합
        }
        System.out.println("배열 요소의 합:" + sum);

    }

}
