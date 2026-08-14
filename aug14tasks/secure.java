

class secureacc {
    private int accno;
    private String accHolderName;
    private String mobileno;
    private String accType;
    private double balance;
    void setter(int accno, String accHolderName, String mobileno, String accType, double balance) {
        this.accno = accno;
        this.accHolderName = accHolderName;
        this.mobileno = mobileno;
        this.accType = accType;
        this.balance = balance;
    }
    void getter() {
        System.out.println("Account Number: " + accno + ", Account Holder Name: " + accHolderName + ", Mobile Number: " + mobileno + ", Account Type: " + accType + ", Balance: " + balance);
    }

}
public class secure{
    public static void main(String[] args) {
        secureacc s1 = new secureacc();
        s1.setter(12345, "Arun Soundappan", "9876543210", "Savings", 4000.0);
        secureacc s2 = new secureacc();
        s2.setter(67890, "Dharaheshh", "9876543211", "Current", 5000.0);
        s1.getter();
        s2.getter();
    }
}
