package day08.static_.method;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
        //main도 static메서드 입니다.
        Count.method02(); //스태틱 메서드

        //일반 멤버변수 객체를 쓰고싶어?
        Count count = new Count();
        count.method01(); //일반메서드

        //static변수 b = 2


        //자바 내부에 많은 static메서드가 존재함
//        Math.random(); //스태틱메서드
//        Arrays.toString(arr);
//        Integer.parseInt("3");


    }


}
