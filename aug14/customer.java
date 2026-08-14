class customerdet {
    int accno;
    String accHolderName;
    long mobileono;
    String accType;
    double balance;

    customerdet(int accno, String accHolderName, long mobileono, String accType, double balance) {
        this.accno = accno;
        this.accHolderName = accHolderName;
        this.mobileono = mobileono;
        this.accType = accType;
        this.balance = balance;
    }
}
public class customer {
    public static void main(String[] args) {
        customerdet c1 = new customerdet(12345, "Arun Soundappan", 9876543210L, "Savings",4000.0);
        customerdet c2 = new customerdet(67890, "Dharaheshh", 9876543211L, "Current",5000.0);
        System.out.println("Account Number: " + c1.accno + ", Account Holder Name: " + c1.accHolderName + ", Mobile Number: " + c1.mobileono + ", Account Type: " + c1.accType + ", Balance: " + c1.balance);
        System.out.println("Account Number: " + c2.accno + ", Account Holder Name   : " + c2.accHolderName + ", Mobile Number: " + c2.mobileono + ", Account Type: " + c2.accType + ", Balance: " + c2.balance);
    }   }
