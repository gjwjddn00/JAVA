package day06.overriding.basic02;

public class Employee extends Person {
    String department;

    @Override
    String info() {
        return "이름: " + name + ", 나이: " + age + ", 부서: " + department;
    }



}
