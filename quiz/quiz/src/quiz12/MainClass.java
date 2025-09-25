package quiz12;

public class MainClass {
    public static void main(String[] args) {
        Marine marine = new Marine(0, 0);
        marine.Location();
        marine.Move(10, 20);
        marine.Stop();

        System.out.println("마린의 공격력 고정값: " + Marine.DEFAULT_ATTACK);
        System.out.println("마린의 방어력 고정값: " + Marine.DEFAULT_ARMOR);

        Tank tank = new Tank(5,5);
        tank.Location();
        tank.Move(15, 25);
        tank.ChangeMode();
        tank.Stop();
        System.out.println();

        DropShip dropShip = new DropShip(3, 3);
        dropShip.Location();
        dropShip.Move(20, 30);
        dropShip.Stop();
        System.out.println();
    }
}
