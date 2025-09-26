package day09.inter.basic2;

public class MainClass {
    public static void main(String[] args) {

        Animal baduk = new Dog();
        Animal nabi = new Cat();
        Animal hodol = new Tiger();

        //dog는 Animal처럼 사용이 됩니다.
        Animal[] arr = {baduk, nabi, hodol};
        for(Animal ani : arr ) {
            ani.eat();
        }

        System.out.println("---------------------------------------");
        //펫 배열
        //Dog는 Animal타입이지만, 하위클래스가 상위클래스와 연관이 있으면, 상호변환이 됩니다.
        IPet[] pets = new IPet[3];
        pets[0] = (IPet)baduk;
        pets[1] = (IPet)nabi;
        pets[2] = new GoldFish();

        for(IPet p : pets ) {
            p.play();
        }

    }
}
