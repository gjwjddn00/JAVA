package day07.modi.protect.pac2;

import day07.modi.protect.pac1.A;

public class C extends A {

    C() {
//        A a = new A();
//        a.i = 1;
//        a.method();

        //protected - 패키지가 다르더라도, super로 접근이 가능함
        super();
        super.i = 1;
        super.method();

    }
}
