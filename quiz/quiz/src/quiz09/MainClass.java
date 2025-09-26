package quiz09;

public class MainClass {
    public static void main(String[] args) {

        Radio r1 = new Radio("라디오1", 100000);
        Radio r2 = new Radio("라디오2", 100000);
        Radio r3 = new Radio("라디오3", 100000);
        Tv t1 = new Tv("tv1", 200000);
        Tv t2 = new Tv("tv2", 200000);

        Market market = new Market();
        market.barcode(r1);
        market.barcode(r2);
        market.barcode(r3);
        market.barcode(t1);
        market.barcode(t2);

        market.printAll();

    }
}
