package day07.poly.basic3;

public class MainClass {
    public static void main(String[] args) {

        //배열에서 다형성
        //하나의 부모타입으로 모든 자식을 담을 수 있음.
        Student s1 = new Student("홍길동", 20,"123123");
        Student s2 = new Student("이순신", 10,"555555");
        Student s3 = new Student("홍길자", 30,"444444");
        Teacher t1 = new Teacher("영자", 30, "수학");
        Teacher t2 = new Teacher("영수", 30, "과학");
        Employee e1 = new Employee("철수", 50, "회계");

        Person[] arr = {s1, s2, s3, t1, t2, e1};

        for(Person p : arr ) {
            System.out.println( p.info() );
        }

        System.out.println("---------------------------");
        //매개변수에 적용될 수 있는 다형성
        House house = new House();
        house.personInfo(s1); //학생
        house.personInfo(s2); //학생
        house.personInfo(s3); //학생
        house.personInfo(t1); //선생
        house.personInfo(t2); //선생
        house.personInfo(e1); //직원

        house.personsInfo(arr); //펄슨 배열

        System.out.println("---------------------------");

        printPerson(s1);
    }

    //
    public static void printPerson(Person p) {

        if(p instanceof Employee) { //emp타입이었다면 true, 아니면 fasle
            Employee e = (Employee)p;
            System.out.println(e.info());

        } else if(p instanceof Teacher) {
            Teacher t = (Teacher)p;
            System.out.println(t.info());

        } else if(p instanceof Student) {
            Student s = (Student)p;
            System.out.println(s.info());
        }


    }



}
