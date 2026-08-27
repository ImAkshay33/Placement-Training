import java.util.*;
public class set {
    public static void main(String [] args){
    String[] registered = {"C101","C102","C103","C101","C104","C105","C103","C106"};
        String[] today = {"C101","C103","C107","C108"};
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for(String s:registered){
            if(seen.contains(s))duplicates.add(s);
            seen.add(s);
            
        }
        for(String s:today){
            if(duplicates.contains(s))System.out.print(s+" ");
        }
}
}