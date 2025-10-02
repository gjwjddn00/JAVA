package api.util.collecion.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {

        //hashset에서 사용한 메서드와 동일함 + 정렬
        //Set<Integer> set = new TreeSet<>();
        TreeSet<String> set = new TreeSet<>();

        set.add("java");
        set.add("css");
        set.add("js");
        set.add("database");

        System.out.println(set.toString());

        for(String s :set ) {
            System.out.println(s);
        }




    }
}
