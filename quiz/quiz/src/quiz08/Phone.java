package quiz08;

/*
 * Phone 클래스 - Person에서 사용될 클래스 타입 멤버변수
 */
public class Phone {
    private String number;
    private String type; // "휴대폰", "집전화" 등

    // 기본 생성자
    public Phone() {}

    // 매개변수가 있는 생성자
    public Phone(String number, String type) {
        this.number = number;
        this.type = type;
    }

    // Getter 메서드들
    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    // Setter 메서드들
    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }

    // 전화번호 정보 반환
    public String getPhoneInfo() {
        return String.format("%s (%s)", number, type);
    }
}
