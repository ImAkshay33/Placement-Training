class bank11 {
    static String bankName = "Mariamman Indian Bank"; 

    int accno;
    String accHolderName;
    long mobileNo;
    String accType;
    double balance;

   bank11(int accno, String accHolderName, long mobileNo, String accType, double balance) {
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
}

public class task11 {
    public static void main(String[] args) {
        bank11 acc1 = new bank11(1001, "Arun", 9876543210L, "Savings", 25000.0);
        bank11 acc2 = new bank11(1002, "Kumar", 9876501234L, "Current", 50000.0);

        acc1.showDetails();
        acc2.showDetails();
    }
}
