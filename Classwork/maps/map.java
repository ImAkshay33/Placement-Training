import java.util.*;
public class map {
    public static void main(String[] args){
        HashMap<String,Float> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Food name along with its Price : ");
        for(int i=0;i<n;i++){
            map.put(sc.next(),sc.nextFloat());
        }
        System.out.println(map);
    }
}
