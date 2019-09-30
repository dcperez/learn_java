import java.util.*;

public class Prog12_01
{
    public static void main (String args[])
    { 
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        
        System.out.print("Enter another number: ");
        int y = in.nextInt();
        
        System.out.println("The sum is " + (x+y));
    } 
}