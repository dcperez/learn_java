//Program 13_04: Formatting output wiht printf
import java.util.*;
public class Prog13_04
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your name, age, and the value of PI: ");
        
        String name = in.nextLine();
        int age = in.nextInt();
        double pi = in.nextDouble();
        
        System.out.printf( "\nHello %s, you are %d and PI = %5.2f\n", name, age, pi);
    }
}