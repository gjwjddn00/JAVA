package day09.inter.basic3;

public class MainClass {
    public static void main(String[] args) {

        //인터페이스를 통해서 클래스를 동작 시킴!!
        Printed lg = new Samsung(); //new Lg();

        lg.print("hello world");
        lg.colorPrint("red");
        lg.copy(5);

    }
}
