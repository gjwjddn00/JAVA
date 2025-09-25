package day05;

//객체를 만들기위한 설계도 클래스 (이런 클래스는 메인이 없습니다)
public class Pen {

    //클래스의 속성 나타내는것 멤버변수(field) 라고 부름
    String ink;
    int price;


    //클래스에서 기능을 나타내는 것을 메서드
    void write() {
        System.out.println("====info====");
        System.out.println("색상:" + ink);
        System.out.println("가격:" + price);
    }

    
}
