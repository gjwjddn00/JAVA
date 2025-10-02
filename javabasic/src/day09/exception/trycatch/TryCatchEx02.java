package day09.exception.trycatch;

public class TryCatchEx02 {
    public static void main(String[] args) {

        int[] arr = {10, 20 ,30, 40};

        int i = 0;
        while( i < 5) {

            try {
                System.out.println(arr[i]);
            } catch (Exception e) {
                System.out.println("예외가 발생했습니다." + e.getMessage());
            } finally {
                System.out.println("예외가 발생하든, 발생하지 않든 무조건 실행 됩니다");
                //외부자원을 사용한 이후에, 자원을 해제 할때 사용함.
            }

            i++;
        }

        System.out.println("프로그램 정상 종료!!!");


    }
}
