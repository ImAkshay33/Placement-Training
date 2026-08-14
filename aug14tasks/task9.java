class bank9{
    private int accno;
    private String acctype;
    private double balance; 
    bank9(int accno,String acctype,double balance){
        this.accno=accno;
        this.acctype=acctype;
        this.balance=balance;
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal of "+amount+" successful. New balance: "+balance);
        }else{
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }
    

}
public class task9 {
    public static void main(String[] args) {
        bank9 b=new bank9(12345, "Savings", 3000.0);
        
        b.withdraw(2000.0);
        b.withdraw(4000.0);
        
    }
    
}
