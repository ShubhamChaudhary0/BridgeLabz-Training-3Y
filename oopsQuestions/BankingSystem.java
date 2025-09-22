import java.util.*;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg){ super(msg); }
}

class BankAcc {
    String accNo; double balance;
    BankAcc(String accNo,double balance){ this.accNo=accNo;this.balance=balance;}
    void deposit(double amt){ balance+=amt; }
    void withdraw(double amt) throws InsufficientFundsException {
        if (amt>balance) throw new InsufficientFundsException("Not enough balance!");
        balance-=amt;
    }
    void transfer(BankAcc other,double amt) throws InsufficientFundsException {
        withdraw(amt); other.deposit(amt);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAcc a1=new BankAcc("111",500);
        BankAcc a2=new BankAcc("222",200);
        try{
            a1.transfer(a2,300);
            System.out.println("Transfer success. A1:"+a1.balance+" A2:"+a2.balance);
            a2.withdraw(600);
        }catch(Exception e){ System.out.println(e.getMessage()); }
    }
}
