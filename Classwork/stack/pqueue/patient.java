import java.util.PriorityQueue;

public class patient {
    String name;
    int severity;
    int arrtime;
    int age;
    patient(String n,int s,int a, int a_){
        name=n;
        severity=s;
        arrtime=a;
        age=a_;
    }
}
class test{
    public static void main(String [] args){
        PriorityQueue<patient> pq=new PriorityQueue<>((b,a)->{
            int res=Integer.compare(a.severity,b.severity);
            if(res!=0){
                return res;

            }
            res=Integer.compare(a.arrtime,b.arrtime);
            if(res!=0){
                return res;
            }
            boolean aVul = (a.age < 12 || a.age > 65);
            boolean bVul = (b.age < 12 || b.age > 65);
            if (aVulnerable != bVulnerable) {
                return aVulnerable ? -1 : 1; 
            }

            
            return a.name.compareTo(b.name);
            
    });
    }
}
