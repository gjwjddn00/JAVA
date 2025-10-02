package api.util.generic;

public class MainClass {
    public static void main(String[] args) {

        ABC abc = new ABC();
        abc.setObj("홍길동");
        String name = (String)abc.getObj();


        //값을 꺼내쓸 때 저장된 타입에 따라 다르게 캐스팅을 해야 된다는
        //단점이 있습니다.
//        abc.setObj( new int[3] );
//        String s2 = (String)abc.getObj();


        System.out.println("-------------------------------------------");

        //1. 제네릭클래스는 그냥 생성할 수 있음
        //DEF def = new DEF(); //뭐든지 저장할수 있는 object지정됨

        //2. 타입을 지정해서 생성함
        DEF<String> def = new DEF<String>();
        def.setT("홍길동");
        String s = def.getT();

        //3. 생성자 <>는 생략가능함
        DEF<Integer> def2 = new DEF<>();
        def2.setT(1);
        int a = def2.getT();


    }
}
