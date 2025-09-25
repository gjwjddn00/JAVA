package quiz01;

import java.util.stream.Stream;

public class Quiz06 {
    public static void main(String[] args) {

    }

    // 문제 1: 구구단 출력 (레벨 1)
    // - 숫자를 받아서 해당 단수에 해당하는 구구단을 출력하세요.
    // - 반환값이 없는 함수입니다.
    static void gugudan(int dan) {
        for(int i = 1; i <= dan; i++){
            System.out.println( dan + " x " + i + " = " + (dan * i));
        }
    }
    // 문제 2: 짝수 판별 (레벨 2)
    // - 숫자를 받아서 짝수인지 홀수인지 판별하는 함수 isEven을 만들어보세요.
    // - 짝수면 true, 홀수면 false를 반환하세요.
    static boolean isEven(int num) {
        return num % 2 == 0;
    }
    // 문제 3: 원의 넓이 (레벨 2)
    // - 반지름을 받아서 원의 넓이를 계산하는 함수 circleArea를 만들어보세요.
    // - 원의 넓이 = π × 반지름² (π는 3.14159 사용)
    static double circleArea(int radius) {
        return 3.14159 * radius * radius;
    }
    // 문제 4: 약수 개수 (레벨 3)
    // - 양의 정수를 받아서 약수의 개수를 세는 함수 countDiv를 만들어보세요.
    // - 예시: 12의 약수는 1, 2, 3, 4, 6, 12이므로 6개
    static int countDiv(int num) {
        int cnt = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                cnt++;
            }
        }
        return cnt;
    }
    // 문제 5: 절대값 반환 (레벨 3)
    // - 숫자를 받아서 절대값을 반환하는 함수 abs를 만들어보세요.
    // - 예시: abs(-5) → 5, abs(3) → 3
    static int abs(int num) {
        if(num < 0) {
            return -num;
        } else {
            return num;
        }
    }

}
