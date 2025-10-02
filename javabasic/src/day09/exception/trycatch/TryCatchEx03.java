package day09.exception.trycatch;

public class TryCatchEx03 {

    public static void main(String[] args) {

        try {
            String a = args[0];
            String b = args[1];
            //문자를 숫자로 바꿈
            int result1 = Integer.parseInt(a);
            int result2 = Integer.parseInt(b);

            System.out.println(result1 + result2);
            //...에러의 종류별로 catch구문을 넣어주면 됩니다.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("프로그램 실행 매개값을 전달해 주세요.");
        } catch (NumberFormatException | NullPointerException e) { // |로 연결하면, 두가지 예외 모두 처리가 가능함
            System.out.println("매개값을 정수로 입력하세요.");
        } catch (Exception e) { //모든 예외클래스의 부모클래스여서, 나머지 모든 예외를 처리할 수 있음.
            System.out.println("기타 예외 입니다");
        }






    }
}
