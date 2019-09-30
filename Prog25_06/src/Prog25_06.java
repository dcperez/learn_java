//Program 25_06
import java.util.*;
public class Prog25_06
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
        
        System.out.println(list);
        list.remove("Orange"); //removes only first occurance
        System.out.println(list);
        //list.remove(0);
        //System.out.println(list);
    }
}