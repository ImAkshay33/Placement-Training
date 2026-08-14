class bank8{
    private int accno;
    private String acctype;
    private double balance; 
    bank8(int accno,String acctype,double balance){
        this.accno=accno;
        this.acctype=acctype;
        this.balance=balance;
    }
    
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit of "+amount+" successful. New balance: "+balance);
    }
   
}
public class task8 {
    public static void main(String[] args) {
        bank8 b=new bank8(12345, "Savings", 3000.0);
        b.deposit(5000.0);
       b.deposit(6000.0);
        
    }
    
}
