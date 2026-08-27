import java.util.*;
class printer{
    String name;
    String task;
    printer(String name,String task){
        this.name=name;
        this.task=task;
    }
}
public class dequeue {
    Queue<printer> q=new LinkedList<>();
    public static void main(String[] args){
        printer[] p=new printer[5];
        for(int i=0;i<5;i++){
            p[i]=new printer("Person "+Integer.toString(i+1),"Administration work "+Integer.toString(i+11));
        }
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int ins=sc.nextInt()-1;
            if(q.contains)
            q.offer(p[ins]);
            
        }
        for(int i=0;i<5;i++){
            System.out.println(q.poll());
        }
    }
}
