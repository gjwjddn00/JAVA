package day06.super_.basic02;

//사람이 가져야하는 부모클래스 공통내용.
public class Person extends Object {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        //복잡한 계산식 x 100
        System.out.println(this);
    }

    Person(String name) {
        this(name, 0);
    }

    Person() {
        this("이름없음", 0);
    }



    String info() {
        return "이름: " + name + ", 나이:" + age;
    }
}
