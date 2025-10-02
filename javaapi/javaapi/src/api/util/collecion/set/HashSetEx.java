package api.util.collecion.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        //값의 저장
        set.add("java");
        set.add("java");
        set.add("java");
        set.add("css");
        set.add("js");

        System.out.println("set의크기:" + set.size());
        System.out.println(set.toString());

        //값을 얻는 메서드가 존재하지 않음
        //set.get()

        //값을 탐색할 때는 반복자라는 개념을 사용해서, 한번씩 찾아봐야함
        Iterator<String> iter = set.iterator();
        while( iter.hasNext()) { //다음값이 존재하면 true, 아니면 false
            System.out.println(iter.next());
        }

        //향상된 for문도 반복자의 개념을 사용합니다.
        for(String s : set) {
            System.out.println(s);
        }

        //값의 존재여부
        if(set.contains("java") ) {
            System.out.println("java가 존재함");
        }
        
        //값의 삭제
        set.remove("java");
        System.out.println( set.toString() );
        
        



    }
}
