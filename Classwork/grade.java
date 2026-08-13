import java.util.Scanner;   
public class grade {
    public static void main(String[] args) {
        int marks=85;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        marks=sc.nextInt();
        char grade;
        if(marks>=90 && marks<=100) {
            grade='A';
        }
        else if(marks>=80) {
            grade='B';
        }
        else if(marks>=70) {
            grade='C';
        }
        else if(marks>=60) {
            grade='D';
        }
        else if(marks>=50) {
            grade='E';
        }
        else if(marks<50 && marks>=0) {
            grade='F';
        }
        else{
            try {
                throw new Exception("Invalid marks");
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        System.out.println("Marks: "+marks+" Grade: "+grade);
    }
}
