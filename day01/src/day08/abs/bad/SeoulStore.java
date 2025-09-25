package day08.abs.bad;

public class SeoulStore extends Store {
    @Override
    public void checken1() {
        System.out.println("간장치킨 가격은 5000원");
    }
    @Override
    public void checken2() {
        System.out.println("순살치킨 가격은 6000원");
    }
    // 오버라이딩 하는걸 깜빡했다면?
}