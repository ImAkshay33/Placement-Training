class sem5 {
    class subject1{
        int marks;
        String coursecode;
    }

}
public class nestedclass {
    public static void main(String args[]){
        sem5 sem=new sem5();
        sem5.subject1 sub=sem.new subject1();
        sub.marks=90;
        sub.coursecode="20cs258";
        System.out.println("Marks: "+sub.marks);
        System.out.println("Course Code: "+sub.coursecode);
    }
}
