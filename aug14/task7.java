class bank7{
    private int accno;
    private String acctype;
    private double balance; 
    bank7(int accno,String acctype,double balance){
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
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit of "+amount+" successful. New balance: "+balance);
    }

}
public class task7 {
    public static void main(String[] args) {
        bank7 b=new bank7(12345, "Savings", 3000.0);
        b.deposit(5000.0);
        b.withdraw(2000.0);
        b.withdraw(4000.0);
        
    }
    
}
