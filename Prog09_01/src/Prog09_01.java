//Prog09_01: Scanner class
import java.util.*;

public class Prog09_01
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter INT: ");
        int x = in.nextInt();
        System.out.println("You entered: " + x);
        
        System.out.print("Enter DOUBLE: ");
        double y = in.nextDouble();
        System.out.println("Yout entered " + y);
    }
}
