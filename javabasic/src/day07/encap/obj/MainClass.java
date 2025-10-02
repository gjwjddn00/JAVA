package day07.encap.obj;

public class MainClass {
    public static void main(String[] args) {

        //객체는 그냥 주소값을 전달하면 됨! (변수로)
        Chef chef = new Chef();

        //hotel객체 생성
        //Hotel hotel = new Hotel(chef);
        Hotel hotel = new Hotel(  new Chef()  );

        hotel.setChef(chef); //setter의 사용
        Chef c = hotel.getChef();
        c.cooking();


    }
}
