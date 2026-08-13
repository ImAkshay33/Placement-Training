import java.util.Scanner;
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
class InsufficientMarksException extends Exception {
    public InsufficientMarksException(String message) {
        super(message);
    }
}

public class markexcept {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter marks for 5 subjects : ");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        try {
            for(int marks : arr) {
                if(marks < 0 || marks > 100) {
                    throw new InvalidMarkException("Marks should be between 0 and 100");
                }
                if(marks < 40) {
                    throw new InsufficientMarksException("Marks are insufficient to pass");
                }
                System.out.println("Valid marks: " + marks);
            }
        } catch(InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(InsufficientMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
          
