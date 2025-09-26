package quiz11;

public class Rect extends Shape{
	
	//1.변의 길이 선언
    private int side;
	//2.사각형은 생성될 때 이름과, 변의 길이를 받음
    public Rect(String name, int side) {
        super(name);
        this.side = side;
    }
	//3.getArea()는 사각형의 넓이를 계산하도록 오버라이딩 처리
    public double getArea() {
        return side * side;
    }

	//main에서 확인

}
