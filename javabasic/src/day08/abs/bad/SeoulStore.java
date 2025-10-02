package day08.abs.bad;

public class SeoulStore extends Store {

    @Override
    public void chicken1() {
        System.out.println("간장치킨 가격은 5000원 입니다.");
    }
    @Override
    public void chicken2() {
        System.out.println("순살치킨 가격은 6000원 입니다.");
    }
    //오버라이딩 하는걸 깜빡! 했다면??
}
