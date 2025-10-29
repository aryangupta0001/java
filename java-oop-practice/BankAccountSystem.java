class BankAccount {
    private long account_num;
    private long balance;
    private String account_holder_name;

    BankAccount() {
        account_num = 0;
        balance = 0;
        account_holder_name = "";
    }

    public long getAccount_num() {
        return account_num;
    }

    public void setAccount_num(long account_num) {
        this.account_num = account_num;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAccount_holder_name() {
        return account_holder_name;
    }

    public void setAccount_holder_name(String account_holder_name) {
        this.account_holder_name = account_holder_name;
    }

    void deposit(long amount) {
        this.balance += amount;

        System.out.println("Deposit Successsfull : " + amount);
        System.out.println("Balance : " + this.balance);
    }

    void withdraw(long amount) {
        if (this.balance >= amount) {
            this.balance -= amount;

            System.out.println("Withdrawl successfull : " + amount);
            System.out.println("Remaining Balance : " + this.balance);
        }

        else
            System.out.println("Withdrawl Failed, Acccount balance not sufficient");
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        BankAccount B = new BankAccount();

        B.setAccount_holder_name("Arvind");
        B.setAccount_num(38726541537l);
        B.setBalance(500);

        B.deposit(4000);

        System.out.println("Account Balance : " + B.getBalance());

        B.withdraw(200);
    }
}
