package quiz17;

public class MainClass {
    public static void main(String[] args) {
        BankQueueSystem bank = new BankQueueSystem();

        bank.takeTicket("홍길동");
        bank.takeTicket("이순신");
        bank.takeTicket("홍길자");

        System.out.println( bank.callNextCustomer() );
        System.out.println( bank.callNextCustomer() );
        System.out.println( bank.callNextCustomer() );
        System.out.println( bank.callNextCustomer() );

    }
}
