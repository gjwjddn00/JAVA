package quiz16;

import java.util.*;

public class MainClass03 {
    public static void main(String[] args) {

        //메뉴를 입력받고, 메뉴에 따라서 기능을 구현.

        Scanner scan = new Scanner(System.in);

        //0. 유저를 저장할 수 있는 List선언
        List<User> list = new ArrayList<>();
        
        while(true){

            System.out.println("[1.회원추가, 2.회원찾기, 3.회원삭제]");
            int menu = scan.nextInt();

            if( menu == 1 ){
                //이름과, 나이를 입력받아서 list에 추가
                System.out.print("이름>");
                String name = scan.next();
                System.out.print("나이>");
                int age = scan.nextInt();

                User user = new User(name,age);
                list.add(user);
                
            } else if( menu == 2 ){
                //이름을 입력받아서, 이름이 있으면 정보를 출력, 없으면 "찾는 회원은 없습니다" 출력.
                System.out.print("찾는 회원이름>");
                String find = scan.next();

                boolean flag = false;

                for(int i = 0; i < list.size(); i++) {
                    User user = list.get(i);
                    if(user.getName().equals(find) ) {
                        System.out.println( "이름:" + user.getName() + ", 나이:" + user.getAge());
                        flag = true;
                        break;
                    }
                }

                if(flag == false) {
                    System.out.println("찾는 회원이 없습니다");
                }

            } else if( menu == 3 ){
                //삭제할 이름을 입력받아서, 있으면 삭제, 없으면 "삭제할 회원이 없습니다" 출력.
                System.out.print("삭제할이름>");
                String find = scan.next();

                boolean flag = false;

                for(int i=0; i < list.size(); i++) {
                    User user = list.get(i);
                    if(user.getName().equals(find) ) {
                        list.remove(i);
                        flag = true;
                        break;
                    }
                }
                if(flag == false) {
                    System.out.println("삭제할 회원이 없습니다");
                }
                
                
            }

        }



    }
}
