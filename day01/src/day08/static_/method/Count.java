package day08.static_.method;

public class Count {
    public int a;
    public static int b;

    // 일반 메서드 - 일반 멤버, 정적 멤버 둘다 접근 가능
    public void method01() {
        a = 10;
        b++; // 사용 가능
        System.out.println(a + ", " + b);
    }
    // 정적 메서드 - 같은 static 멤버만 접근 가능
    // 단, 객체를 생성해서 접근하는건 가능함
    public static void method02() {
        b++;
        // a = 10;
        Count count = new Count();
        count.a = 10;
    }
}
