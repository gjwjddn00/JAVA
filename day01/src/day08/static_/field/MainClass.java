package day08.static_.field;

public class MainClass {
    public static void main(String[] args) {

        Count c1 = new Count();
        c1.a++;
        c1.b++;
        System.out.println(c1.a + "," + c1.b  );

        Count c2 = new Count();
        c2.a++;
        c2.b++;
        System.out.println(c2.a + "," + c2.b);

        Count c3 = new Count();
        c3.a++;
        c3.b++;
        System.out.println(c3.a + "," + c3.b);

        //1. static키워드는 객체랑 상관없이 다른 영역에 1개 만듬
        //2. static변수는 객체들 사이에서 공유하는 변수가 됨
        //3. static변수는 객체 바깥에 만들어지기 때문에 (클래스명.변수명) 으로 사용함

        Count.b++;
        Count.b = 100;
        System.out.println(c2.b); //100
        
    }
}
