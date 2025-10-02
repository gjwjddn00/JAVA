package api.util.collecion.queue;

public class User implements Comparable<User> {
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

    //우선순위 비교를 위한 메서드
    @Override
    public int compareTo(User o) {
        //return this.name.compareTo( o.getName() ); //나의 이름과 쟤의 이름을 compareTo
        //return o.getName().compareTo(name);
        //return Integer.compare(this.age, o.getAge());
        return Integer.compare(o.getAge(), this.age);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
