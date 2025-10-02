package api.util.collecion.list;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println( stack.toString() );

        System.out.println( stack.peek() ); //값을 확인만 하기

        System.out.println( stack.pop() ); //값을 삭제하기
        System.out.println( stack.pop() );
        //System.out.println( stack.pop() );
        //System.out.println( stack.pop() ); //뺄게 없으면 에러
        System.out.println( stack.toString() );


    }
}
