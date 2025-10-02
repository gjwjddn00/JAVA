package day06.super_.basic02;

public class Teacher extends Person {

    String subject; //선생의 고유기능

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override //어노테이션 - 이거 오버라이딩 됬음! ㅎㅎㅎ
    String info() {
        return "이름: " + name + ", 나이: " + age + ", 과목: " + subject;
    }
}
