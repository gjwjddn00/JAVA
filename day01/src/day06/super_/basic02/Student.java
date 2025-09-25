package day06.super_.basic02;

public class Student extends Person {

    String studentId; //학생의 고유기능

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    //super.메서드() - 오버라이딩된 자식에서 부모님 메서드를 호출해야할 때.
    String info() {
        return super.info() + ", 학번:" + studentId;
    }
}
