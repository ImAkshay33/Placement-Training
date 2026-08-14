
class bankacc {
    static String bankname="Mariamman Indian Bank";
    int accno;
    bankacc(int accno){
        this.accno=accno;
        
    }
}
public class bank{
    public static void main(String[] args){
        bankacc b1=new bankacc(1234);
        System.out.println("Bank Name: "+bankacc.bankname);
        System.out.println("Account Number: "+b1.accno);
        bankacc b2=new bankacc(5678);
        System.out.println("Bank Name: "+bankacc.bankname);
        System.out.println("Account Number: "+b2.accno);
        bankacc b3=new bankacc(9012);
        System.out.println("Bank Name: "+bankacc.bankname);
        System.out.println("Account Number: "+b3.accno);
    }
}
