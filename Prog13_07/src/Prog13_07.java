//Program 13_07: Using String Methods
import java.util.*;
public class Prog13_07
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String s = "I LIKE programming in Java";
        System.out.println(s);
        
        System.out.println("\n(To continue, hit Enter)");
        in.nextLine();
        
        s = s.replaceAll("LIKE", "LOVE");
        System.out.println("\n" + s);
        
        System.out.println("\n(To continue, hit Enter)");
        in.nextLine();
        
        s = s.substring(0,2) + "REALLY" + s.substring(1, s.length());
        System.out.println("\n" + s);
        
        s = s.replaceAll( "in Java", "LANGUAGES");
        System.out.println("\n" + s);
    }
}