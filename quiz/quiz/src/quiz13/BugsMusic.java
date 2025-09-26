package quiz13;

public class BugsMusic implements SongList {
	
	private String[] list = new String[100];
	private int count = 0;

    @Override
    public void insertList(String song) {
        System.out.println("벅스뮤직!");
        list[count] = song;
        count++;
    }
    @Override
    public void playList() {
        System.out.println("벅스뮤직!");
        for(int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
    }

    @Override
    public int playLength() {
        return count;
    }

    /* SongList인터페이스를 상속 받습니다.
	 * 마음대로 작성.
	 * 
	 */
	
}
