package day01;

public class OperationEx01 {
    public static void main(String[] args) {

        int i = 1;
        System.out.println( -i ); //부호연산자

        //증감연산자
        int k = 1;
        //int h = k++; //먼저 값을 대입하고, 그 다음에 증가
        int h = ++k;   //먼저 값을 증가하고, 그 다음에 대입
        System.out.println("k값:" + k + ", h값:" + h );

        //비트연산자
        byte b = 10; //0000 1010
        System.out.println(~b); //1111 0101
        System.out.println(~b + 1); //더했을때 0이 되는 수가 나옴

        //논리 반전 연산자
        System.out.println( !true ); //f


    }
}
