class bank12 {
    private int accno;
    private String accHolderName;
    private long mobileNo;
    private String accType;
    private double balance;
    static String bankName = "Mariamman Indian Bank";

    bank12(int accno, String accHolderName, long mobileNo, String accType, double balance) {
        this.accno = accno;
        this.accHolderName = accHolderName;
        this.mobileNo = mobileNo;
        this.accType = accType;
        this.balance = balance;
    }

    void showDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accno);
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: Rs." + balance);
        System.out.println();
    }

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

    void changeMobile(long newMobile) {
        mobileNo = newMobile;
        System.out.println("Mobile number updated to: " + mobileNo);
    }
}

public class task12 {
    public static void main(String[] args) {
        // Account 1
        bank12 acc1 = new bank12(1001, "Arun", 9876543210L, "Savings", 25000.0);
        acc1.showDetails();                
        acc1.deposit(5000.0);             
        acc1.withdraw(3000.0);             
        acc1.changeMobile(9999999999L); 
        acc1.deposit(-1000.0);             
        acc1.withdraw(-500.0);           
        acc1.withdraw(50000.0);            

        System.out.println();

        // Account 2
        bank12 acc2 = new bank12(1002, "Kumar", 9876501234L, "Current", 50000.0);
        acc2.showDetails();                
        acc2.deposit(10000.0);             
        acc2.withdraw(5000.0);             
        acc2.showDetails();                
    }
}
