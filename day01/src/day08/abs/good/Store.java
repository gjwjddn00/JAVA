package day08.abs.good;

import jdk.jfr.Percentage;

public abstract class Store {
    /*
        추상 메서드
        abstract 키워드를 붙이면 추상메서드가 됩니다. 추성메서드는 몸체 {}가 없는 메서드 선언
        추상 메서드를 쓰고싶으면, 추상 클래스여야 합니다
        추상클래스도, 멤버변수, 생성자, 일반메서드 전부 가질 수 있음
        단, 객체생성은 하지 못함.
    */
    public abstract void chicken1();
    public abstract void chicken2();
    public abstract void chicken3();

    public String storeName = "다른 치킨";
    public Store() {}
    public String info() {
        System.out.println(storeName + "입니다");
        return "";
    }

}
