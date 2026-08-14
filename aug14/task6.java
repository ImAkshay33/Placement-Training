class bank6{
    int accno;
    String acctHolderName;
    long mobileno;
    String accType;
    double balance;
    void getAccountNumber(){
        System.out.println("Account Number: " + accno);
    }
    void getAccountHolderName(){
        System.out.println("Account Holder Name: " + acctHolderName);
    }
    void getMobileNumber(){
        System.out.println("Mobile Number: " + mobileno);
    }
    void getAccountType(){
        System.out.println("Account Type: " + accType);
    }
    void getBalance(){
        System.out.println("Balance: " + balance);
    }
    void setMobileNumber(long mobileno){
        this.mobileno = mobileno;
    }

}
public class task6 {
    public static void main(String[] args) {
        bank6 b=new bank6();
        b.accno=12345;
        b.acctHolderName="Arun Soundappan"; 
        b.mobileno=9876543210L;
        b.accType="Savings";
        b.balance=4000.0;
        System.out.println("Details of Account before using setter for mobile number:");
        b.getAccountNumber();
        b.getAccountHolderName();
        b.getMobileNumber();
        b.getAccountType();
        b.getBalance();
        System.out.println("Updating mobile number...");
        b.setMobileNumber(9999999999L);
        System.out.println("Details of Account after using setter for mobile number:");
        b.getMobileNumber();
    }
}
