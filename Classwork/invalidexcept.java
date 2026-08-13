 import java.util.Scanner;
 class ageexception extends Exception {
    public ageexception(String message) {
        super(message);
    }
class insufficientbalanceexception extends Exception {
    public insufficientbalanceexception(String message) {
        super(message);
    }
}
public class invalidexcept {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt() ;

        try {
            if(age<18) {
                throw new ageexception("Age is less than 18");
            }
            System.out.println("Age is valid: "+age);
        }
        catch(ageexception e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Program continues...");

    }
}
