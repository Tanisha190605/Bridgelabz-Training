package Java_Constructors.Modifiers;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance!");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance() + ", Interest Rate: " + interestRate + "%");
    }  
}

public class Bank_account {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("123456789", "Tanisha", 10000, 5.0);
        sa.display();
        sa.deposit(2000);
        sa.withdraw(5000);
        sa.withdraw(8000);

        System.out.println("\nAfter transactions:");
        sa.display();

	}

}
