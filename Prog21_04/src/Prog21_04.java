//Program 21_04
import java.util.*;
public class Prog21_04
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int ctr = 0;
        boolean stop = false;
        System.out.println("This program will stop after ten trials ");
        System.out.println("or when a negative number is entered");
        
        while (ctr < 10 && !stop)
        {
            System.out.print("Enter a number: ");
            double x = in.nextDouble();
            
            if (x < 0) stop = true;
            else System.out.println("Sqrt(" + x + ")=" + Math.sqrt(x));
            
            ctr++;
        }
    }
}