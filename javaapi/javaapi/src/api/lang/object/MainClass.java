package api.lang.object;

public class MainClass {

    public static void main(String[] args) throws Throwable {

        /*
        equals() - 객체의 주소값을 비교 true, false
        toString() - 객체 주소를 문자열 (오버라이딩 해서 멤버변수 명을 반환 많이 사용됨)
        hashCode() - 객체의 고유한 주소값을 숫자로 반환
        finalize() - 객체가 사라지는 시점에 호출되는 메서드 (deprecated - 없어질 메서드니깐 쓰지마세요! )
        clone() - 객체자체를 복사해서 반환
        */

        Person p = new Person("홍길동");
        Person p2 = new Person("홍길동");

        System.out.println( p.equals(p2) );
        System.out.println( p.toString() );
        System.out.println( p.hashCode() );
        System.out.println( p2.hashCode() );
        //finalize는 가비지컬렉터가 호출될때 객체가 사라지게 되는데,
        //이 순서를 보장하진 않기 때문에 사용이 권장되지는 않는다.

        Object p3 = p.clone();
        System.out.println(p3.toString());



    }
}
