package quiz11;

public class Circle extends Shape {

	//1. 반지름 선언
    private int radius;
	//2. 원형은 생성될 때 이름과, 반지름을 받습니다.
    Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }
	//3. getArea()는 사각형의 넓이를 계산하도록 오버라이딩
    public double getArea() {
        return radius * radius * Math.PI;
    }
	//main에서 확인
	
}