import java.util.Scanner;

class BankAccount {

    String name;
    double balance;
    double dividendRate; // example: 0.05 = 5%

    // Constructor
    public BankAccount(String name, double initialDeposit) {
        this.name = name;
        this.balance = initialDeposit;
        this.dividendRate = 0.0;
    }

    // Deposit money
    public void deposit(double amount) {
        balance = balance + amount;
        // too simple - need refinement
    }

    // Withdraw money
    public void withdraw(double amount) {
        balance = balance - amount;
        // too simple - need refinement
    }

    // Calculate dividend
    public double calculateDividend() {
        return balance * dividendRate;
    }

    // Apply dividend to balance
    public void applyDividend() {
        double dividend = calculateDividend();
        balance = balance + dividend;
    }

    // Set dividend rate
    public void setDividendRate(double rate) {
        dividendRate = rate;
        // too simple - need refinement
    }

    // Display account information
    public void printObjectState() {
        System.out.println("\n===== ACCOUNT INFO =====");
        System.out.println("Name          : " + name);
        System.out.println("Balance       : RM " + balance);
        System.out.println("Dividend Rate : " + dividendRate * 100 + "%");
        System.out.println();
    }
}

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== BANK ACCOUNT SYSTEM =====");

        // Input
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial deposit: RM ");
        double initialDeposit = sc.nextDouble();

        // Create account
        BankAccount acc1 = new BankAccount(name, initialDeposit);

        System.out.println("\nAccount created successfully.");
        acc1.printObjectState();

        // Deposit
        System.out.println("----- DEPOSIT -----");
        System.out.print("Enter deposit amount: RM ");
        double depositAmount = sc.nextDouble();
        acc1.deposit(depositAmount);
        acc1.printObjectState();

        // Withdraw
        System.out.println("----- WITHDRAW -----");
        System.out.print("Enter withdrawal amount: RM ");
        double withdrawAmount = sc.nextDouble();
        acc1.withdraw(withdrawAmount);
        acc1.printObjectState();

        // Dividend
        System.out.println("----- YEAR-END DIVIDEND -----");
        System.out.print("Enter dividend rate (example 0.05 for 5%): ");
        double rate = sc.nextDouble();
        acc1.setDividendRate(rate);
        acc1.applyDividend();

        acc1.printObjectState();

        System.out.println("===== END OF PROGRAM =====");

        sc.close();
    }
}
