class bankacc {
    int amt;
    String description;
    String id_no;

    bankacc() {
        amt = 0;
        description = "";
        id_no = "";
    }

    void deposit(int amount) {
        amt += amount;
        System.out.println("Amount deposited: " + amount);
    }

    void deposit(int amount, String desc) {
        amt += amount;
        description = desc;
        System.out.println("Amount deposited: " + amount + " Description: " + description);
    }

    void deposit(int amount, String desc, String id) {
        amt += amount;
        description = desc;
        id_no = id;
        System.out.println("Amount deposited: " + amount + " Description: " + description + " ID: " + id_no);
    }
}

class savings extends bankacc {
    static double interest_rate = 0.06;

    savings() {
        super();
    }

    void interest_calculation() {
        double interest = amt * interest_rate;
        System.out.println("Interest earned: " + interest);
    }
}

class current extends bankacc {
    static double interest_rate = 0.12;

    current() {
        super();
    }

    void interest_calculation() {
        double interest = amt * interest_rate;
        System.out.println("Interest earned: " + interest);
    }
}

public class bankov {
    public static void main(String args[]) {
        savings s = new savings();
        current c = new current();

        s.deposit(1000);
        s.deposit(2000, "Salary");
        s.deposit(3000, "Bonus", "12345");
        s.interest_calculation();

        c.deposit(5000);
        c.deposit(6000, "Investment");
        c.deposit(7000, "Profit", "67890");
        c.interest_calculation();
    }
}
