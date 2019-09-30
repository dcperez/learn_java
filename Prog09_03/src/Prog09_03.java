import java.util.*;

public class Prog09_03
{ 
    public static void main (String args[])
    {
      Scanner in = new Scanner (System.in);
      
        System.out.print("Enter String: ");
        String s= in.nextLine();
        System.out.println("You entered: " + s);
        
        System.out.print("Enter Float: ");
        float f = in.nextFloat();
        System.out.println("You entered: " + f);
        
        System.out.print("Enter Long: ");
        long t = in.nextLong();
        System.out.println("You entered: " + t);
    }
}