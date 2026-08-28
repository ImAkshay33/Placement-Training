import java.util.*;
public class shop {
    public static void main(String[] args) {
        Map<String,Double> cart=new HashMap<>();
        cart.put("Laptop",55000.0);
        cart.put("Mouse",800.0);
        cart.put("Keyboard",1500.0);
        cart.put("Headphone",2500.0);
        cart.remove("Headphone");
        String search="Mouse";
        if(cart.containsKey(search))System.out.println(search+" "+cart.get(search));
        else System.out.println(search+" not found");
        cart.put("Keyboard",2000.0);
        System.out.println("Shopping Cart");
        System.out.println("-------------");
        for(Map.Entry<String,Double> e:cart.entrySet())System.out.println(e.getKey()+""+e.getValue());
        double total=0;
        for(double price:cart.values())total+=price;
        System.out.println("Total = "+total);
        double max=Double.MIN_VALUE;String maxProduct="";
        for(Map.Entry<String,Double> e:cart.entrySet())if(e.getValue()>max){max=e.getValue();maxProduct=e.getKey();}
        System.out.println("Most Expensive = "+maxProduct);
    }
}


