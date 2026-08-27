import java.util.*;
public class ip {
    int pno;
    int interviewer;
    int no_of_can;
    ip(int n){
        no_of_can=n;
    }

}
class test{
    public static void main(String[] args){
    ArrayList<ip> arr=new ArrayList<>();
    arr.add(new ip(2));
    arr.add(new ip(3));
    arr.add(new ip(1));
    arr.add(new ip(4));
    arr.add(new ip(5));
    Queue<ip> pq=new PriorityQueue<>(( a, b)->{
        return a.no_of_can-b.no_of_can;
    });
   
        pq.addAll(arr);
    
    for(int i=0;i<5;i++){
        System.out.println(pq.poll().no_of_can);
    }



}}