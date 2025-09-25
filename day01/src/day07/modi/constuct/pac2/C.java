package day07.modi.constuct.pac2;

import day07.modi.constuct.pac1.A;

public class C {

    //멤버변수
    A a = new A(1); //public (o)
//    A a2 = new A(true); //default (x)
//    A a3 = new A("홍길동"); //private (x)

    /// //////////////////////////////////////////
    C() {
        a.a = 1;
        //a.b = 2; //default (x)
        //a.c = 3; //private (X)
        a.method01();
        //a.method02(); //default (x)
        //a.method03(); //private (x)
    }


}
