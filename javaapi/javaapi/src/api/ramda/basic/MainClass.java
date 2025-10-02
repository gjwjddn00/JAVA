package api.ramda.basic;

public class MainClass {
    public static void main(String[] args) {

        Person p = new Person();

//        p.greeting(new Say01() {
//            @Override
//            public void hello() {
//                System.out.println("안녕!!!");
//            }
//        });


        //코드가 한줄이면 {} 생략함.
//        p.greeting( () -> {
//            System.out.println("안녕!!!");
//        });

        p.greeting( () -> System.out.println("안녕!") );

        //익명기법
//        String result = p.greeting(new Say02() {
//            @Override
//            public String greeting(String word) {
//                return word.repeat(3);
//            }
//        });
//        System.out.println(result);

        //람다식에서 매개변수의 타입은 생략됩니다 (자동추론)
//        String result = p.greeting( (word) -> {
//            return word.repeat(3);
//        });

        //매개변수가 1개면 ()를 생략할 수 있음
        //코드가 한줄이면 {} 생략가능. 자동으로 리턴
        String result = p.greeting( word -> word.repeat(3) );
        System.out.println(result); //hihihihihihihihi






    }
}
