//Program 26_02: For-each
import java.util.*;
public class Prog26_02
{
    public static void main(String[] args) {
        Prog26_02 myApp = new Prog26_02();
    }
    
    public Prog26_02()
    {
        String[] fruits = {"apple", "banana", "mango", "orange", "peach"};
        
        for (String s : fruits)
        {
            System.out.println(s + " ");
        }
        System.out.println();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(10);
        numbers.add(21);
        numbers.add(32);
        
        for (int n : numbers)
        {
            System.out.println(n + " ");
        }
        System.out.println();
    }
}