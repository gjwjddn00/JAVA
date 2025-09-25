package day08.abs.bad;

public class MainClass {
    public static void main(String[] args) {

        SeoulStore store = new SeoulStore();
        store.checken1();
        store.checken2();
        // 반드시 오버라이딩을 해야하는데,
        // 하지못했다면, 잘못된 메서드가 동작 되어버림
//        store.checken3();
    }
}