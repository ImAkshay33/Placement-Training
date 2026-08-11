import java.util.Scanner;
class details{
    public int emid;
    public String name;
    double salary;
    String address;
    details(int emid,String name,double salary,String address){
        this.emid=emid;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
}
public class emp{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of employees : ");
        int n=sc.nextInt();
        details d[]=new details[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter id, name, salary, and address for employee "+(i+1));
            int emid=sc.nextInt();
            String name=sc.next();
            double salary=sc.nextDouble();
            String address=sc.next();
            d[i]=new details(emid,name,salary,address);
        }
        for(int i=0;i<n;i++){
            System.out.println("Employee "+(i+1));
            System.out.println( " id : "+d[i].emid+ "\nname : "+d[i].name+ "\nsalary : "+d[i].salary+ "\naddress : "+d[i].address );
        } }}