package day06.overriding.basic02;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "홍길동"; //물려받음
        s1.age = 18; //물려받음
        s1.studentId = "123123"; //내꺼
        System.out.println( s1.info() ); // <---

        Teacher t = new Teacher();
        t.name = "이순신";
        t.age = 20;
        t.subject = "수학";
        System.out.println(t.info() );
    }
}
