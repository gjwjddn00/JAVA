package quiz08;

/*
 * 문제: Person 클래스를 완성하세요
 * 
 * 요구사항:
 * 1. name (String) 멤버변수 선언
 * 2. phone (Phone 타입) 멤버변수 선언 (클래스 타입)
 * 3. 모든 멤버변수에 대한 getter/setter 메서드 작성
 * 4. 기본 생성자와 매개변수가 있는 생성자를 만들고, 초기화를 진행.
 * 5. getPersonInfo() 로 이름과, 휴대폰 정보 출력(getPhoneInfo)를 호출하면됩니다.
 * 
 */
public class Person {
    private String name;
    private Phone phone;

    public Person() {}

    public Person(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    //
    public void getPersonInfo() {
        System.out.println("Name : " + name + ", Phone : " + phone.getPhoneInfo() ) ;
    }


}
