package day06.overriding.basic;

public class Child extends Parent {
    
    //오버라이딩
    //1. 부모님의 메서드 원형과 똑같이 만들면됨
    //2. 내용만 바꿈
    void method02() {
        System.out.println("자식의 오버라이딩 된 2번 메서드 실행");
    }
    
}
