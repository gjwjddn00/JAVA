package day08.static_.designpattern;

public class MainClass {

    public static void main(String[] args) {

        //new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);

    }
}
