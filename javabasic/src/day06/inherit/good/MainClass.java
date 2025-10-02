package day06.inherit.good;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동"; //물려받음
        s1.age = 18; //물려받음
        s1.studentId = "123123"; //내꺼
        System.out.println( s1.info() );
    }
}
