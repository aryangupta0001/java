/*
12️⃣ ATM Simulation

🧩 Concept: OOP + Encapsulation
⚙️ Classes:

BankAccount → balance, deposit(), withdraw()

ATM → user interacts with account using a menu.
💡 Hint: Use Scanner for input and methods for each operation.
*/

import java.util.Scanner;

class BankAccount {

    private String account_holder_name;
    private long account_no;
    private long balance;

    BankAccount(String account_holder_name, long account_no, long balance) {
        this.account_holder_name = account_holder_name;
        this.account_no = account_no;
        this.balance = balance;
    }

    void deposit(long amount) {
        this.balance += amount;
        System.out.println("Amount Deposited : " + amount);
        System.out.println("Balance : " + this.balance);
    }

    void withdraw(long amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Amount Withdrawl Successfull : " + amount);
            System.out.println("Remaining Balance : " + this.balance);
        }

        else
            System.out.println("Withdrawl failed due to insufficient balance");
    }

    void checkBalance() {
        System.out.println("Balance : " + this.balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        BankAccount obj = new BankAccount("Arvind", 38731582567l, 450000);

        while (true) {
            System.out.println("Enter Your Choice : ");
            System.out.println("1. Deposit\n2. Withdrawl\n3. Check Balance\n4. Exit");
            int choice = Sc.nextInt();
            long amount;

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit : ");
                    amount = Sc.nextLong();
                    obj.deposit(amount);
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw : ");
                    amount = Sc.nextLong();
                    obj.withdraw(amount);
                    break;

                case 3:
                    obj.checkBalance();
                    break;

                case 4:
                    Sc.close();
                    return;
                default:
                    break;
            }

        }

    }
}