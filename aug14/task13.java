class bank13{
    static String bankName = "Mariamman Indian Bank";
    private int accountNumber;
    private String accountHolderName;
    private long mobileNumber;
    private String accountType;
    private double balance;
    bank13(int accountNumber, String accountHolderName, long mobileNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    int getAccountNumber() { return accountNumber; }
    String getAccountHolderName() { return accountHolderName; }
    long getMobileNumber() { return mobileNumber; }
    String getAccountType() { return accountType; }
    double getBalance() { return balance; }
    void setMobileNumber(long newMobile) { mobileNumber = newMobile; }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of Rs." + amount + " successful. New balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount: Rs." + amount);
        }
    }
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount: Rs." + amount);
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of Rs." + amount + " successful. New balance: Rs." + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
    void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs." + balance);
        System.out.println();
    }
}

public class task13 {
    public static void main(String[] args) {
        bank13 acc1 = new bank13(1001, "Arun", 9876543210L, "Savings", 25000.0);
        acc1.displayAccountDetails();
        acc1.deposit(5000.0);
        acc1.displayAccountDetails();
        acc1.withdraw(3000.0);
        acc1.displayAccountDetails();
        acc1.setMobileNumber(9999999999L);
        System.out.println("Updated Mobile Number: " + acc1.getMobileNumber());
        acc1.deposit(-1000.0);
        acc1.withdraw(-500.0);
        acc1.withdraw(50000.0);
        System.out.println();
        bank13 acc2 = new bank13(1002, "Kumar", 9876501234L, "Current", 50000.0);
        acc2.displayAccountDetails();
        acc2.deposit(10000.0);
        acc2.withdraw(5000.0);
        acc2.displayAccountDetails();
    }
}
