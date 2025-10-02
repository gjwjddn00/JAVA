package day06.overloading.basic;

public class Basic {
    
    /*
    오버로딩 - 같은 이름의 메서드 or 생성자를 여러개 만들 수 있음.
    규칙
    1. 이름이 같음
    2. 반환유형은 오버로딩에 영향을 미치지 않음
    3. 매개변수 개수, 유형, 순서 등을 다르게 하면 됩니다.
     */
    
    void input(int num) {
        System.out.println("정수 1개 입력");
    }

//    int input(int num) {
//        return 0;
//    }
    
    void input(int num, String str) {
        System.out.println("정수 1개, 문자열 1개 입력");
    }
    
    void input(String str, int num) {
        System.out.println("문자열 1개, 정수 1개 입력");
    }
    
    void input(String s) {
        System.out.println("문자열 1개 입력");
    }
    
    //생성자의 오버로딩
    Basic() {

    }

    Basic(int num) {

    }




    
    
}
