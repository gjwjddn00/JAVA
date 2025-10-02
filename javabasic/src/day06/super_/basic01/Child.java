package day06.super_.basic01;

public class Child extends Parent {
    //생성자 첫째줄에 super()가 들어가야하는데, 아무것도 적지 않으면 super() 자동으로 들어갑니다.
    Child(String father, String mother) {
        super(father, mother);
    }

}
