package day06.overloading.basic;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        Basic b = new Basic();
        b.input(1);
        b.input("홍길동");
        b.input(1, "her!");
        b.input("her!", 22);


    }
}
