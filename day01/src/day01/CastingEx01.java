package day01;

public class CastingEx01 {
    public static void main(String[] args) {
        //자동형변환 - 크기가 작은 타입을 큰타입에 저장할때, 자동으로 타입변함
        byte b = 10;
        int a = b; //자동형변환
        long l = b; //byte -> long 자동형변환

        char s = '가';
        int i = s; //char -> int
        System.out.println(i);
        System.out.println("-------------------------------------------------");
        //명시적형변환 - 큰타입을 작은타입으로 넣을 때 (type) 으로 변환함

        int k = 70;
        char c = (char)k;
        System.out.println(c);

        float f = (float)k;
        System.out.println(f);

        //명시적 변환시에 값을 저장할 수 없는 범위가 들어오면 잘린값이 저장됩니다.
        int j = 1000;
        byte b1 = (byte)j;
        System.out.println(b1);

    }
}
