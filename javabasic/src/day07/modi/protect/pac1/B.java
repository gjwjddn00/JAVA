package day07.modi.protect.pac1;

public class B {

    B() {
        A a = new A(); //접근가능
        a.i = 1;
        a.method();
    }
}
