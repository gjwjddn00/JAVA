package api.util.collecion.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {

        //우선순위 큐
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(4);
        queue.offer(3);
        queue.offer(1);
        queue.offer(2);
        queue.offer(5);

        System.out.println(queue);

        System.out.println( queue.poll() );
        System.out.println( queue.poll() );
        System.out.println( queue.poll() );
        System.out.println( queue.poll() );
        System.out.println( queue.poll() );

        //객체를 우선순위 큐에 저장.
        //우선순위 큐에 값이 들어가면, 우선순위를 지정하기 위해서 내부적으로
        //compareTo 메서드를 호출을 시킵니다.
        //compareable인터페이스를 상속받는 compareTo메서드를 반드시 구현해야합니다.
        Queue<User> que = new PriorityQueue<>();

        System.out.println("홍길동".compareTo("홍길자") ); //동 < 자
        System.out.println("홍길자".compareTo("홍길동") ); //자 > 동
        
        
        que.offer( new User("홍길동", 10) );
        que.offer( new User("홍길자", 20) );
        que.offer( new User("이순신", 30) );
        que.offer( new User("신사임당", 40) );
        que.offer( new User("김철수", 50) );

        while( que.isEmpty() == false) {
            System.out.println(que.poll());
        }

        
        


    }
}
