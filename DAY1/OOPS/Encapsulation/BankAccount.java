package DAY1.OOPS.Encapsulation;

public class BankAccount {
    // Private data members (Encapsulation: data is hidden)
    private double balance;

    // Public methods to interact with the data (Encapsulation: controlled access)
    public BankAccount(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }
    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0.0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to check the balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        account.deposit(50.0);
        account.withdraw(30.0);
        System.out.println("Balance: " + account.getBalance());  // Output: Balance: 120.0
    }
}

