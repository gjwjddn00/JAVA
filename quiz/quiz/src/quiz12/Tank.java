package quiz12;

public class Tank extends Unit{
    public Tank(int x, int y) {
        super(x, y, 100);
    }

    public void ChangeMode() {
        System.out.println("공격 모드");
    }
}
