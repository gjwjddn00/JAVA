package quiz18;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {
    public static void main(String[] args) {

        /*
        1. Random클래스를 활용해서 1~45까지의 랜덤한 번호를 생성
        2. Set을 이용해서 6개의 고유한 로또번호를 만들어내는 프로그램 코드 작성해보세요.
         */

        Random random = new Random();
        Set<Integer> set = new HashSet<>();

        while( set.size() < 6 ) {
            int ran = random.nextInt(45) + 1;
            set.add(ran);
        }

        System.out.println( set.toString() );





    }
}
