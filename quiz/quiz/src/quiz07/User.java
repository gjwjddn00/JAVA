package quiz07;

public class User {
    //단순히, 데이터를 저장하기 위한 용도로 클래스 사용.
    //프로그래밍에서 많이 사용.
    private String name;
    private int age;
    private String rrn;

    //생성자 - 기본생성자, 멤버변수 초기화 생성자
    public User() {}

    public User(String name, int age, String rrn) {
        this.name = name;
        this.age = age;
        this.rrn = rrn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }
}
