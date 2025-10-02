package day04;

public class MethodEx01 {

    public static void main(String[] args) {
        //메서드는 클래스 안, main밖에 만듭니다.

        hello();
        some(1, 2); //매개변수를 일치시켜야함

        int result = sum();
        System.out.println("result = " + result);

        String result2 = ranString(10, "hi");
        System.out.println("result2 = " + result2);

        //return키워드
        sayHello("bye"); //return키워드를 만나서 종료됨
        sayHello("hello");

    }

    //반환 x, 매개변수 x
    static void hello() {
        System.out.println("hello");
    }
    //반환 x, 매개변수 o
    static void some(int a, int b) {
        System.out.println(a + b);
    }
    //반환 o, 매개변수 x
    static int sum() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        //반드시 return키워드에 돌려줄 값을 넣어줍니다.
        return sum;
    }
    //반환 o, 매개변수 o
    static String ranString(int a, String b) {
        String sum = "";
        for(int i = 1; i <= a; i++) {
            sum += b;
        }
        return sum;
    }

    static void sayHello(String str) {
        //반드시 hello문자열이 전달되야 하는 메서드
        //hello문자열 이라면 true, 아니면 false
        if(   !str.equals("hello")  ) {
            System.out.println("hello 문자열을 넘겨주세요");
            return; //함수의 종료
        }
        System.out.println(str);
    }



}
