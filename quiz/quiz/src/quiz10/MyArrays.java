package quiz10;

public class MyArrays {

    // 1. 이 클래스를 외부에서 생성할 수 없도록, 생성자에 private을 붙임
    private MyArrays() {}

        // 2. Arrays.toString() 메서드를 따라해보기
        public static String toStringArray ( int[] arr){
            // 문자열 합
            String str = "[";
            for (int i = 0; i < arr.length; i++) {
                str += arr[i];
                if(i == arr.length -1) {
                    break;
                }
                str += ", ";
            }
        str += "]";
        return str;
    }
}
