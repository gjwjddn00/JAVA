package day02;

public class BreakEx02 {
    public static void main(String[] args) {

        탈출:for(char c = 'A'; c <= 'Z'; c++) {
            for(char l = 'a'; l <= 'z'; l++) {
                System.out.println(c + " - " + l );
                //if(l == 'c') break;
                //완전히 바깥반복문을 탈출하고 싶으면 이름붙이기
                if(l == 'c') break 탈출;
            }
        }

    }
}
