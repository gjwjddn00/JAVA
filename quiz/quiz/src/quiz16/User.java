package quiz16;

public class User {
    //회원정보를 저장하는 용도의 클래스
    private String name;
    private int age;

    //생성자
    public User() {}

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    //getter, setter
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
}
