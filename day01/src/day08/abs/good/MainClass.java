package day08.abs.good;

public class MainClass {
    public static void main(String[] args) {

        Store store = new Store() {
            @Override
            public void chicken1() {

            }

            @Override
            public void chicken2() {

            }

            @Override
            public void chicken3() {

            }
        };
        //다형성 처럼 사용해도 됨
        store.chicken1();
        store.chicken2();
        store.chicken3();
        store.info();
        System.out.println("이름" + store.storeName);
    }
}
