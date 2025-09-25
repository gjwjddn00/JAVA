package day06.inherit.bad;

public class Teacher {

    String name;
    int age;
    String subject; //선생의 고유기능

    String info() {
        return "이름: " + name + ", 나이:" + age;
    }
}
