package quiz12;

public class MainClass {
    public static void main(String[] args) {

        Unit m1 = new Marin(0, 0);
        m1.location();
        m1.stop();
        m1.move();
        System.out.println( "공격력:" + Marin.attack + ", 방어력:" + Marin.armor );


    }
}
