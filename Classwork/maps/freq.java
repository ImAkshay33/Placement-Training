import java.util.*;

public class freq {
    public static void main(String[] args){
        HashMap<Character,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
