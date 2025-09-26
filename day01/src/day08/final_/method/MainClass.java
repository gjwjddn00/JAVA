package day08.final_.method;

public class MainClass {
    public static void main(String[] args) {

        Child child = new Child("123123-1231231");

//        child.nation = "김미국"; //값의 변경이 안됨!!!
//        child.ssn = "123121-123111111";

        //상수!!!
        System.out.println( Math.PI );
        System.out.println( Contant.PI );
        System.out.println( Contant.EARTH_RADIUS );
        System.out.println( Contant.URL  );

    }
}
