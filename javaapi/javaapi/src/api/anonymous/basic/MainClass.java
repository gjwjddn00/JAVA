package api.anonymous.basic;

public class MainClass {
    public static void main(String[] args) {


//        Car car = new Tico();
//        car.run();

        //Car인터페이스를 구현하는 클래스가 매번 달라진다면 익명객체를 사용할 수 있음.

        Car car = new Car() {
            @Override
            public void run() {
                System.out.println("i am a Tico");
            }
        };

        car.run();

        Car car2 = new Car() {
            @Override
            public void run() {
                System.out.println("i am a pride");
            }
        };

        //람다로 바뀌면?
        Car car3 = () -> {
            System.out.println("i am a pride");
        };

    }
}
