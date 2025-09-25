package day07.poly.basic2;

public class Child extends Parent {

    @Override
    public void method02() {
        System.out.println("자식의 오버라이딩 된 메서드 2번");
    }
    
    public void method03() {
        System.out.println("자식의 메서드 3번");
    }
}
