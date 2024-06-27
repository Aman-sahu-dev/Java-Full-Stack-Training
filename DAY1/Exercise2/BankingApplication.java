package DAY1.Exercise2;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public void displayDetails() {
        System.out.println("Account [Account Number: " + accountNumber + ", Balance: " + balance + "]");
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest: " + interest);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Savings Account [Interest Rate: " + interestRate + "%]");
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount or overdraft limit exceeded");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Current Account [Overdraft Limit: " + overdraftLimit + "]");
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000, 5);
        CurrentAccount current = new CurrentAccount("CA123", 2000, 1000);

        savings.deposit(1000);
        savings.calculateInterest();
        savings.withdraw(2000);
        savings.displayDetails();

        current.deposit(2000);
        current.withdraw(2500);
        current.displayDetails();
    }
}
