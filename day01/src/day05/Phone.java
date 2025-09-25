package day05;

public class Phone {

    String model;
    String color;
    int price;

    //생성자는 클래스와 대소문자 까지 동일하고, 반환유형이 없습니다.
    //보통 멤버변수를 초기화 하는 역할로 사용을 함.
    Phone() {
        System.out.println("phone생성자 호출!");
        model = "갤럭시S23";
        color = "그린";
        price = 1000;
    }
    //생성자 오버로딩
    //생성자는 여러개 일 수 있습니다.
    //단, 매개변수의 개수나, 순서를 다르게 해야 합니다.
    Phone(String color) {
        this.color = color;
        this.price = 100;
        this.model = "아이폰17";
    }

    Phone(String color, int price ) {
        this.color = color;
        this.price = price;
        this.model = "가로본능";
    }

    //멤버변수를 모두 받아서 초기화 하는 생성자
    Phone(String color, int price, String model) {
        this.color = color;
        this.price = price;
        this.model = model;
    }


    void info() {
        System.out.println("===info===");
        System.out.println("모델:" + model);
        System.out.println("색상:" + color);
        System.out.println("가격:" + price);
    }

}
