package quiz13;

public interface SongList {
	public void insertList(String song);
	public void playList();
	public int playLength();

    public default void method() {
        System.out.println("11111");
    }
    public static void method02() {
        System.out.println("22222");
    }


}
