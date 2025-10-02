package api.util.collecion.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {
    public static void main(String[] args) {

        //양방향 큐
        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offerFirst(100); //일반 큐와 다르게 앞에서 추가하기 기능
        queue.offerFirst(200);
        queue.offerFirst(300);

        System.out.println(queue.toString());

        System.out.println("앞에서 꺼낼때 나올값:" + queue.peekFirst() );
        System.out.println("뒤에서 꺼낼떄 나올값:" + queue.peekLast()) ;

        //큐의 삭제
        System.out.println( queue.pollLast() ); //뒤에서 삭제
        System.out.println( queue.pollFirst() ); //앞에서 삭제
        System.out.println( queue.toString() );

    }
}
