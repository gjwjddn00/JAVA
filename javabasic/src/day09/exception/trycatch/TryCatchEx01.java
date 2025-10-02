package day09.exception.trycatch;

public class TryCatchEx01 {
    public static void main(String[] args) {

        //int[] arr = new int[5];
        //arr[5] = 100;

        //String str = null;
        //str.concat("abc");

        try {

            int result = Integer.parseInt("#E$%@$%#$%R#"); //문자 -> 숫자로 변경
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage()); //예외의 기본 메시지를 출력.
        }

        System.out.println("프로그램 정상종료!");

    }
}
