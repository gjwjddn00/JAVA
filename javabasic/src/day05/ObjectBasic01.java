package day05;

public class ObjectBasic01 {

    public static void main(String[] args) {
        //객체를 활용하지 않는다면....
        //1번계산기
//        System.out.println( add(1) );
//        System.out.println( add(2) );
//        System.out.println( add(3) );
    
        //객체를 활용하는 방식
        System.out.println("1번계산기");
        Calculator cal1 = new Calculator();
        System.out.println( cal1.add(1) );
        System.out.println( cal1.add(2) );
        System.out.println( cal1.add(3) );

        System.out.println("2번계산기");
        Calculator cal2 = new Calculator();
        System.out.println(cal2.add(10) );
        System.out.println(cal2.add(20) );
    
    
    }


    //계산기1
//    static int num = 0;
//    static int add(int data) {
//        num += data;
//        return num;
//    }

    //계산기2
//    static int num2 = 0;
//    static int add2(int data) {
//        num2 += data;
//        return num2;
//    }


}
