package day07.poly.basic3;

public class House {

    //사람 정보를 출력.
    public void personInfo(Person s) {
        System.out.println(s.info());
    }


    //사람들 정보를 받아서 반복문으로 출력.
    //personsInfo() - 매개변수 Person[] 이 되면 됩니다.
    public void personsInfo(Person[] arr) {

        for(Person p : arr ) {
            System.out.println( p.info() );
        }
    }
}
