package api.ramda.basic;

public class Person {

    public void greeting(Say01 s) {
        s.hello();
    }


    public String greeting(Say02 s) {
        String result = s.greeting("hihihi");
        return result;
    }

}
