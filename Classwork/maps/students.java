import java.util.*;
public class students {
    public static void main(String [] args){
        HashMap<Integer,Double> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<sc.nextInt();i++){
            map.put(sc.nextInt(),sc.nextDouble());
        }
        System.out.println("Enter roll to search");
        int r=sc.nextInt();
        if(map.containsKey(r)){System.out.println(r+":"+map.get(r));}
        else System.out.println("Key not found");
        double max=-1;
        int key=-1;
        
        for(Map.Entry<Integer,Double> e : map.entrySet()){
            if(e.getValue()>max){max=e.getValue();key=e.getKey();}
            double val=e.getValue();

            if(e.getValue()>75)System.out.println(e.getKey() + " -> " + val);
        }
        System.err.println(max);
    }
}
