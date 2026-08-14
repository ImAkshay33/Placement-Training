class bank5 {
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

}

public class task5{
    public static void main(String[] args){
        bank5 b1=new bank5();
        b1.accno=12345;
        b1.acctHolderName="Arun Soundappan";
        b1.mobileno=9876543210L;
        b1.accType="Savings";
        b1.balance=4000.0;

        bank5 b2=new bank5();
        b2.accno=67890;
        b2.acctHolderName="Dharaheshh";
        b2.mobileno=9876543211L;
        b2.accType="Current";
        b2.balance=5000.0;

        System.out.println("Details of Account 1:");
        b1.getAccountNumber();
        b1.getAccountHolderName();
        b1.getMobileNumber();
        b1.getAccountType();
        b1.getBalance();

        System.out.println("\nDetails of Account 2:");
        b2.getAccountNumber();
        b2.getAccountHolderName();
        b2.getMobileNumber();
        b2.getAccountType();
        b2.getBalance();
    }
}


