class bank4{
    int accno;
    String acctHolderName;
    long mobileno;
    String accType;
    double balance;
    bank4(int accno,String acctHolderName,long mobileno,String accType,double balance){
        this.accno=accno;
        this.acctHolderName=acctHolderName;
        this.mobileno=mobileno;
        this.accType=accType;
        this.balance=balance;
    }
}
public class task4{
    public static void main(String[] args){
        bank4 b1=new bank4(12345,"Arun Soundappan",9876543210L,"Savings",4000.0);
        bank4 b2=new bank4(67890,"Dharaheshh",9876543211L,"Current",5000.0);
        System.out.println("Account Number: "+b1.accno+", Account Holder Name: "+b1.acctHolderName+", Mobile Number: "+b1.mobileno+", Account Type: "+b1.accType+", Balance: "+b1.balance);
        System.out.println("Account Number: "+b2.accno+", Account Holder Name: "+b2.acctHolderName+", Mobile Number: "+b2.mobileno+", Account Type: "+b2.accType+", Balance: "+b2.balance);
    }
}


