//Program 25_07: Remove all occurances in an array list
import java.util.*;
public class Prog25_07
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Mango");
        list.add("Orange");
        list.add("Banana");
        list.add("Orange");
        list.add("Kiwi");
        list.add("Orange");
        list.add("Apple");
        
       //removes ALL occurances of orange
       while (list.contains("Orange"))
       {
           list.remove("Orange");
       }
        System.out.println(list);
        
        
    }
}