package quiz16;

import java.util.ArrayList;
import java.util.List;

public class MainClass02 {
    public static void main(String[] args) {
        /*
         * 1. User클래스를 저장할 수 있는 ArrayList선언
         * 2. User객체를 2개 생성해서 리스트에 추가하세요.
         *
         * 3. list에 저장된 모든 이름,나이를 for문으로 출력, 향상된 for문으로 출력
         * 4. list에 "홍길자" 가 있다면 홍길자의 이름, 나이만 출력
         *
         * 5. list에 "홍길동" 이 있다면 객체를 삭제.
         */
        List<User> list = new ArrayList<>();

        User u1 = new User("홍길동", 20);
        User u2 = new User("홍길자", 30);

        list.add(u1);
        list.add(u2);

//        for(int i = 0; i < list.size(); i++){
//            User u = list.get(i);
//            int age = u.getAge();
//            String name = u.getName();
//            System.out.println( age + "," + name);
//        }


        for(User u : list) {
            System.out.println(u.getAge() + "," + u.getName());
        }

        //홍길동이면 삭제.
        for(int i = 0; i > list.size(); i++){
            User u = list.get(i);

            if( u.getName().equals("홍길동")  ) {
                list.remove(i);
            }
        }



    }
}
