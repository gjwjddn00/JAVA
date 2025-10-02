package day09.inter.basic;

public class Basic /*extends Object*/ implements Inter1, Inter2 {

    //인터페이스가 가지고 있는 추상메서드는 클래스에서 반드시 오버라이딩이 들어감!
    //인터페이스는 여러 인터페이스를 상속(구현) 받을 수 있음.
    @Override
    public void method01() {
        System.out.println("오버라이딩 된 1번 메서드");
    }

    @Override
    public void method02() {
        System.out.println("오버리이딩 된 2번 메서드");
    }
}
