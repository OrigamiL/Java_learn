import java.io.Serializable;

public class AccountThread  implements Serializable,Runnable {
    private static final long serialVersionUID = 5729837805640480889L;
    private final Account account;

    public AccountThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在取款,余额为 ---->"+account.withdraw(500.0));
    }

    public static void main(String[] args) {
        Account account = new Account(1,1000.0);
        AccountThread accountThread = new AccountThread(account);
        Thread t1 = new Thread(accountThread);
        Thread t2 = new Thread(accountThread);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
