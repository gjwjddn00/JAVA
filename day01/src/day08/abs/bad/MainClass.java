package day08.abs.bad;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        SeoulStore store = new SeoulStore();
        store.chicken1();
        store.chicken2();
        store.chicken3(); // 반드시 오버라이딩을 해야하는데, 하지못했다면, 잘못된 메서드가 동작 되어버림


    }
}
