package api.lang.string;

public class StringBufferEx {
    public static void main(String[] args) {

        String str = new String("hello");
        StringBuilder sb = new StringBuilder("hello");

        str = str + " world"; //Hello문자열 + world를 붙여서 새로운 객체를 생성
        sb.append(" world"); //원본 Hello문자열을 변경

        System.out.println(str);
        System.out.println(sb);

        //중간에 추가하기
        sb.insert(6, "my ");
        System.out.println(sb);

        //문자열 변경하기
        sb.replace(6, 8, "your"); //6이상~8미만
        System.out.println(sb);

        //문자열 삭제
        sb.delete(6, 11); //6~11미만 삭제
        System.out.println(sb);

        //거꾸로
        sb.reverse();
        System.out.println(sb);

        System.out.println("------------------------------------------------------");

        //문자열과 StringBuffer의 속도 차이
        long start = System.currentTimeMillis();

//        String s = "A";
//        for(int i = 1; i <= 300000; i++) {
//            s += "A";
//        }
        StringBuilder s = new StringBuilder("A");
        for(int i = 1; i <= 300000; i++) {
            s.append("A");
        }

        long end = System.currentTimeMillis();

        System.out.println( (end - start) * 0.001 + "초" );

    }
}
