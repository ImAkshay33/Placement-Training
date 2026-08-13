import java.util.Scanner;
class InvalidPasswordException extends Exception {
    public InvalidPasswordException() {
        super("Password must contain atleast 8 characters" );
    }
}
class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String message) {
        super(message);
    }
}

public class passval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        try{
            if(password.length()<8) {
                throw new InvalidPasswordException();
            }
            else if(!password.equals("userN@ame123")) {
                throw new IncorrectPasswordException("Incorrect password entered");
            }
    
    }}}
