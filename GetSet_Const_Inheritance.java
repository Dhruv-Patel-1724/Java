class Account {
    private long accono;
    private String name;
    protected long balance;

    public Account(long a, String n, long balance) {
        accono = a;
        name = n;
        //this.balance = balance;
        setBalance(balance);  // uses validation logic

    }

    public long getAccount() {
        return accono;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }
    public void setBalance(long b){
        if(b>0)
        balance=b;
        else
        balance=0;
         System.out.println("⚠️ Warning: Negative balance not allowed. Balance set to 0.");
    }
}

class SavingAccount extends Account {
    public SavingAccount(long a, String n, long balance) {
        super(a, n, balance);
    }

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdral(long amount) {
        balance -= amount;
    }
}

class Loan extends Account {
    public Loan(long a, String n, long balance) {
        super(a, n, balance);
    }

    public void payEmi(long amount) {
        balance -= amount;
    }
}

public class GetSet_Const_Inheritance {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(12345678, "Dhruv Patel", -44);
        s.deposit(4566);
        s.withdral(4565);
        System.out.println("Saving Account:");
        System.out.println("Name: " + s.getName());
        System.out.println("Account No: " + s.getAccount());
        System.out.println("Balance: " + s.getBalance());

        Loan l = new Loan(987654321, "Jinal Patel", 200000);
        l.payEmi(15000);
        System.out.println("\nLoan Account:");
        System.out.println("Name: " + l.getName());
        System.out.println("Account No: " + l.getAccount());
        System.out.println("Balance After EMI: " + l.getBalance());
    }
}
