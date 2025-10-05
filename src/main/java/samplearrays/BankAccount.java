package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    double[] transactions = new double[1000];
    int transactionCount = 0; // Keeps track of how many transactions have been recorded

    public BankAccount(String name, double startingBalance) {
        this.name = name;
        this.currentBalance = startingBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
        }

        // Update balance and record transaction
        currentBalance += amount;
        recordTransaction(amount);

        System.out.println(name + " deposited " + amount + ". New Balance: " + currentBalance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");

        }

        if (amount > currentBalance) {
            System.out.println("Error: Insufficient funds. Withdrawal unsuccessful.");

        }

        // Update balance and record transaction
        currentBalance -= amount;
        recordTransaction(-amount); // Store withdrawals as negative values

        System.out.println(name + " withdrew " + amount + ". New Balance: " + currentBalance);
    }

    // Helper method to record a transaction
    private void recordTransaction(double amount) {
        if (transactionCount < transactions.length) {
            transactions[transactionCount] = amount;
            transactionCount++;
        } else {
            System.out.println("Transaction history full — cannot record more transactions.");
        }
    }

    // Display all recorded transactions
    public void displayTransactions() {
        System.out.println("\nTransaction history for " + name + ":");
        if (transactionCount == 0) {
            System.out.println("No transactions recorded.");
        }

        for (int i = 0; i < transactionCount; i++) {
            double amount = transactions[i];
            if (amount > 0) {
                System.out.println("Deposit: +" + amount);
            } else {
                System.out.println("Withdrawal: " + amount);
            }
        }
    }

    // Display the current balance
    public void displayBalance() {
        System.out.println("\nCurrent balance for " + name + ": " + currentBalance);
    }

    // Main method for testing
    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();
        // ----- DO NOT CHANGE -----
    }
}
