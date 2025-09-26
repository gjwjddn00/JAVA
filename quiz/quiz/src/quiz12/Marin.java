package quiz12;

public class Marin extends Unit {

    public static int attack = 6;
    public static int armor = 0;

    public Marin(int x, int y) {
        super(x, y, 60);
    }
    @Override
    public void location() {
        System.out.println("현재위치:" + getX() + "," + getY());
    }
    @Override
    public void stop() {
        System.out.println("정지!");
    }
    @Override
    public void move() {
        System.out.println("이동!");
    }
}
