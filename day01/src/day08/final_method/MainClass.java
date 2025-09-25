package day08.final_method;

public class MainClass {
    public static void main(String[] args) {
        Child child = new Child("123456 - 1234567");

//        child.nation = "김의재"; // 한번 지정되면 값의 변경이 안됌!
//        child.ssn = "123456 - 1234567";

        System.out.println(Math.PI);
        System.out.println(Contant.PI);
        System.out.println(Contant.EARTH_RADIUS);
        System.out.println(Contant.URL);
    }
}
