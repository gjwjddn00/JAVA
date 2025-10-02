package day06.this_;

public class Employee extends Person {
    String department;

    @Override
    String info() {
        return "이름: " + name + ", 나이: " + age + ", 부서: " + department;
    }



}
