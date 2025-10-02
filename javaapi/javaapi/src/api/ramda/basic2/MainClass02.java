package api.ramda.basic2;

import java.util.*;
import java.util.stream.Collectors;

public class MainClass02 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 100; i++) {
            list.add(new Random().nextInt(100) + 1);
        }
        System.out.println(list.toString());

        // 중복제거
        list.stream().distinct().forEach(s -> System.out.print(s + " "));

        // sort() 정렬
        System.out.println("");
        list.stream().sorted().forEach(s -> System.out.print(s + " "));
        // 중복제거 sort() 정렬
        System.out.println("");
        list.stream().distinct().sorted().forEach(s -> System.out.print(s + " "));

        // 필터링 filter
        System.out.println("");
        list.stream().filter(s -> s >=50).sorted().forEach(s -> System.out.print(s + " "));

        // map 새로운 리스트로 반환
        System.out.println("");
        list.stream()
                .map(s -> s % 2 == 0 ? "짝" : "홀")
                .forEach(s -> System.out.print(s + " "));

        // mapTo ~~ 다른 스트림탑으로 형벼환
        System.out.println("");
        long x = list.stream()
                .mapToDouble(s -> s * s)
//                .forEach(s -> System.out.print(s + " "));
                .count(); // 최종처리
        System.out.println("리스트의 개수" + x);

        // 집계함수
        System.out.println("");
        int sum = list.stream().mapToInt(s -> s).sum();
        System.out.println("리스트 합계: " + sum);


        System.out.println("");
        OptionalDouble result = list.stream().mapToInt(s -> s).average();
        double avg = result.getAsDouble();
        System.out.println("리스트 평균: " + avg);

        System.out.println("");
        Optional<Integer> result2 = list.stream().max((a, b) -> a.compareTo(b));
        int max = result2.get();
        System.out.println("리스트 안에서 가장 큰값" + max);

        // collect() - 새로운 타입의 컬렉션으로 집계할때 사용
        System.out.println("");
        List<Integer> newList =
        list.stream()
                .filter(i -> i >=80)
                .collect(Collectors.toList());
        System.out.println(newList);

        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("");

        String[] arr = {"hong", "lee", "kim", "choi", "park", "kim"};
        List<String> result3 = Arrays.asList(arr)
                .stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result3);
    }
}
