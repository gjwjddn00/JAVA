package quiz02;

public class Car {
    /*
    클래스명: Car
    멤버변수:
      brand (String): 브랜드
      speed (int): 현재 속도
    생성자:
        브랜드를 받는 생성자
    메서드:
      accelerate(): 가속 - speed += 10 으로 100까지 증가
      brake(): 브레이크 - speed -= 10 으로 0까지 감소
      getCarInfo(): 자동차 정보 출력
     */

    String brand;
    int speed;

    Car(String brand) {
        this.brand = brand;
    }

    void accelerate() {
        for(int i = 0; i <= 100; i+=10 ) {
            speed = i;
            System.out.println("현재속도:" + speed);
        }
    }

    void brake() {
        for(int i = speed; i >= 0; i-=10) {
            speed = i;
            System.out.println("현재속도:" + speed);
        }
    }

    void getCarInfo() {
        System.out.println("====car info====");
        System.out.println("브랜드:" + brand);
        System.out.println("현재속도:" + speed);
    }


}
