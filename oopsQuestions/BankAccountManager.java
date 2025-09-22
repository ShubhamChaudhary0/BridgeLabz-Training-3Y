class BankAccount {
    String accNo;
    double balance;

    BankAccount(String accNo, double balance) {
        this.accNo = accNo; this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: "+amt+" New Balance: "+balance);
    }

    void withdraw(double amt) {
        if (amt>balance) {
            System.out.println("Overdraft not allowed!");
        } else {
            balance -= amt;
            System.out.println("Withdrew: "+amt+" New Balance: "+balance);
        }
    }

    void checkBalance() {
        System.out.println("Balance: "+balance);
    }
}

public class BankAccountManager {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(2000);
        acc.checkBalance();
    }
}
