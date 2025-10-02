package day09.exception.throws_;

public class ThrowsEx02 {

    public ThrowsEx02() throws Exception {
        aaa();
    }

    public void aaa() throws Exception {
        System.out.println( 1 / 0);
    }


    public static void main(String[] args) throws Exception {

        ThrowsEx02 ex = new ThrowsEx02();

    }



}
