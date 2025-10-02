package api.thread.ex01;

public class MainClass02 {
    public static void main(String[] args) {

    // 1개의 객체를 n개의 쓰레드로 실행
    ThreadTest threadTest = new ThreadTest();

    Thread thread1 = new Thread(threadTest, "A");
    Thread thread2 = new Thread(threadTest, "B");

    thread1.start();
    thread2.start();
    }
}