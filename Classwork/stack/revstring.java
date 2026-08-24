import java.util.*;

public class revstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<String> s=new Stack<>();
        Stack<Character> t=new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            s.push(sc.next());
        }
        for(int i=0;i<n;i++){
            String w=s.pop();
        
            for(int j=0;j<w.length();j++){
                t.push(w.charAt(j));

            }
            t.push(' ');

        }
        while(!t.isEmpty()){
            System.out.print(t.pop());
        }
    
}}
