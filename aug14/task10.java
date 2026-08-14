class bank10 {
    int accno;
    String accHolderName;
    long mobileono;
    String accType;
    double balance;

    bank10(int accno, String accHolderName, long mobileono, String accType, double balance) {
        this.accno = accno;
        this.accHolderName = accHolderName;
        this.mobileono = mobileono;
        this.accType = accType;
        this.balance = balance;
    }
    void displayAccountDetails() {
        System.out.println("Account Number: " + accno);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Mobile Number: " + mobileono);
        System.out.println("Account Type: " + accType);
        System.out.println("Balance: " + balance);
    }
}
public class task10 {
    public static void main(String[] args) {
        bank10 p1 = new bank10(12345, "Arun Soundappan", 9876543210L, "Savings",4000.0);
        bank10 p2 = new bank10(67890, "Dharaheshh", 9876543211L, "Current",5000.0);
        p1.displayAccountDetails();
        p2.displayAccountDetails();
    }   }
