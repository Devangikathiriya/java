class IFexception extends Exception {
    IFexception(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: Rs. " + amt);
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("Not sufficient funds to withdraw " + amt);
            return;
        }
        balance -= amt;
        System.out.println("Withdrawn: Rs. " + amt);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankApp {
    public static void main(String[] args) {
        Account a1 = new Account(25000);

        a1.deposit(25000);  

        try {
            a1.withdraw(20000); 
            a1.withdraw(4000);  
            a1.withdraw(2000);  
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Balance: Rs. " + a1.getBalance());
    }
}