package quiz11;

public class MainClass {
    public static void main(String[] args) {

        Shape circle = new Circle("원형", 5);
        Shape rect = new Rect("사각형", 4);

        System.out.println( circle.getArea() );
        System.out.println( rect.getArea() );


    }
}
