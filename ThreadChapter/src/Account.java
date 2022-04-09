import static java.lang.Thread.sleep;

public class  Account {
    private int accountNum;
    private double balance;

    public Account() {
        System.out.println("调用无参构造");
    }

    public Account(int accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public double withdraw(double money) {
        synchronized (this){
            this.setBalance(this.balance-money);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return this.balance;
        }

    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    static  {
        System.out.println("静态代码块执行");
    }
}
