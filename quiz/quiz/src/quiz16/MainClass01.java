package quiz16;

import java.util.ArrayList;
import java.util.List;

public class MainClass01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        //1. list에 1~20까지 정수를 반복문으로 저장
        for (int i = 1; i <= 20; i++) {
            list.add(i);
            //arr[i] = i;
        }

        //2. 저장한 값을 반복문으로 출력
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
