package day07.modi.constuct.pac1;

public class B {

    //멤버변수
    A a = new A(1); //public (o)
    A a2 = new A(true); //default (o)
//    A a3 = new A("홍길동"); //private (x)

    /// ////////////////////////////////////////////////
    B() {
        a.a = 1;
        a.b = 2;
        //a.c = 3; //private (X)
        a.method01();
        a.method02();
        //a.method03(); //private (x)
    }





}
