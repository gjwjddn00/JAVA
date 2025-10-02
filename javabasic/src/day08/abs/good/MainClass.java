package day08.abs.good;

public class MainClass {
    public static void main(String[] args) {

        /*
        다형성 처럼 사용도 됨!!!

        자식클래스를 사용해서 부모클래스를 구체화 해서 사용합니다.
        */

        Store store = new SeoulStore();
        store.chicken1();
        store.chicken2();
        store.chicken3();
        store.info();
        System.out.println("이름:" + store.storeName);

        Store busanStore = new BusanStore();
        busanStore.chicken1();
        busanStore.chicken2();
        busanStore.chicken3();
        busanStore.info();
        System.out.println("이름:" + busanStore.storeName);


    }
}
