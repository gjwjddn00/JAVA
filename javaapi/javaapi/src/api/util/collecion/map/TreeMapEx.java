package api.util.collecion.map;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        //HashMap이랑 사용방법은 동일함
        //TreeSet기반으로 만들어짐 - 키가 정렬됨
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(100, "hong");
        map.put(50, "lee");
        map.put(23, "choi");
        map.put(70, "kim");

        System.out.println(map.toString());



    }
}
