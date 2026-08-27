import java.util.ArrayList;
class colors{
    int id;
    String name;}
    public class colorsclass {
    public static void main(String[] args){
         ArrayList<colors> colorList = new ArrayList<colors>();
         colors color1 = new colors();
         color1.id = 1;
         color1.name = "Red";
         colorList.add(color1);
         
         colors color2 = new colors();
         color2.id = 2;
         color2.name = "Green";
         colorList.add(color2);
         
         for(colors c : colorList){
             System.out.println("ID: " + c.id + ", Name: " + c.name);
         }
    }
}