import java.util.*;
public class queue {
    public static void main(String [] args){
        Queue<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        for(int i=0;i<4;i++){
            System.out.print(q.poll()+" ");
        }
    }
}
