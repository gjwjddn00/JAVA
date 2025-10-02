package day08.final_.method;

public class Child extends Parent {

    //public void method01() {}

    //final변수는 변경금지 - 값을 반드시 초기화 해야 합니다.
//    public final String nation = "한국";
    public final String ssn;

    public Child(String ssn) {
        this.ssn = ssn;
    }

}
