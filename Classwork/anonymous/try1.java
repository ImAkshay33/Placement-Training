
class intcl{
    void print(){

    }
}
public class try1{
    public static void main(String []args ){
        intcl obj=new intcl(){
            void print(){System.out.print("Anonymous class accessed");}
        };
        obj.print();

    }
}
