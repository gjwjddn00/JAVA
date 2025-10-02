package day08.static_.basic;


public class Calculator {
    /*
    계산기 마다, 각기 다른값을 가져야 되는 경우는 일반변수로 선언.
    계산기 마다 동일한 값을 가진다면, static변수로 선언 합니다.
     */
    private String color;
    private int result;
    public static double pi = 3.14;
    /*
    일반 멤버를 참조하는 메서드는 일반메서드로 만들면 됨!
    클래스 안에서 범용성 있게 사용하는 메서드는 static키워드를 붙이면 좋음!
     */
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public static double circle(int radius) {
        return pi * radius * radius;
    }


}
