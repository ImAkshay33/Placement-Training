import java.util.ArrayList;
public class arrlist {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("element at index 2");
        list.add("element at last index");
        System.out.println("The elements in the list are: " + list);
        System.out.println("the first element is: " + list.get(0));
    
    }
}
