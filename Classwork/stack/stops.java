import java.util.*;
public class stops{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("1.push\n2.pop()\n3.peek\n4.isEMpty\n5.size\n6.display\n-1.exit");
        while(true){
            int op=sc.nextInt();
            switch(op){
                case 1 ->{
                    int n=sc.nextInt();
                    st.push(n);
                }
                case 2->System.out.println(st.pop());
                case 3->System.out.println(st.peek());
                case 4->System.out.println(st.empty()?"Stack is empty":"Stack is NOT empty");
                case 6->System.out.println(st);
                case 5->System.out.println("SIZE :"+st.size());
                case -1->{System.out.println("Exiting..");return;}
        }
        }
        
    }
}