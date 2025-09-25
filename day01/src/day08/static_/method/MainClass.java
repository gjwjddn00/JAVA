package day08.static_.method;

public class MainClass {
    public static void main(String[] args) {
        // main도 static method입니다

        Count.method02(); // 스태틱 메서드
        
        // 일반 멤버변수 사용하고 싶다면?
        Count count = new Count();
        count.method01(); // 일반 메서드

        // 자바 내부에 많은 static메서드가 존재함
//        Math.random(); // 스태틱 메서드
//        Arrays.toString(arr);
//        Integer.ParseInt("3");
    }
}
