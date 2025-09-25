package day07.poly.basic;

//하나에 자바파일에 여러 클래스를 선언할 수 있습니다.
//단, public클래스는 하나여야 하고, 파일명과 동일한 클래스 여야 합니다.
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
    /*
    다형성
    자식 객체가 부모타입에 저장될 수 있는 특징
     */
    A a = new A();
    A b = new B();
    A c = new C();
    A d = new D();
    A e = new E();

    int i = 1;
    double dd = i;

    //상속관계가 없다면, 다형성 x
    //B bb = new E();

    //Object에는 모든 클래스 타입이 저장될 수 있음
    Object o1 = 1;
    Object o2 = "문자열";
    Object o3 = new A();
    Object o4 = new B();

}
