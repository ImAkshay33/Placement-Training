public class balexcept {
    public static void main(String[] args) {
        int balance=1000,withdraw=1500;
        try {
            if(withdraw>balance) {
                throw new ArithmeticException("Insufficient balance");
            }
            balance-=withdraw;
            System.out.println("Withdrawal successful. Remaining balance: "+balance);
        }
        catch(ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
