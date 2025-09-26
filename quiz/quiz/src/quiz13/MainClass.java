package quiz13;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        
        //스위치 모드
        Scanner scan = new Scanner(System.in);
        SongList music = null;
        System.out.println("======1.벅스뮤직 2.멜론뮤직");
        int mode = scan.nextInt();

        if(mode == 1) {
            music = new BugsMusic();
        } else if(mode == 2) {
            music = new MelonMusic();
        }
            
        while(true) {
            System.out.println("메뉴를 선택하세요.");
            System.out.println("메뉴: 1.저장, 2.재생 3.목록개수 >");

            int menu = scan.nextInt();

            if(menu == 1) {
                System.out.print("음악>");
                String song = scan.next();
                music.insertList(song);

            } else if(menu == 2) {
                music.playList();
            } else if(menu == 3) {
                int len = music.playLength();
                System.out.println(len + "개의 재생목록이 있습니다");
            }
        }
        
        
        
        
    }
}
