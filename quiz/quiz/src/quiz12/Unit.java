package quiz12;

public class Unit {
    private int x;
    private int y;
    private int hp;

    Unit(int x, int y, int hp) {
        this.x = x;
        this.y = y;
        this.hp = hp;
    }
    
    public void Location() {
        System.out.println("현재 위치: " + x + " " + y);
    }
    
    public void Move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("이동 완료: " + x + " " + y);
    }
    
    public void Stop() {
        System.out.println("멈춤");
    }
}
