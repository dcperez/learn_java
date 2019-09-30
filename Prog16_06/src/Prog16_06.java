//Program 16_06
import java.util.*;
public class Prog16_06
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double x, y;
        System.out.print("Enter a value for x: ");
        x = in.nextDouble();
        
        if (x <= 0)
            y = Math.pow(x,2);
        else y = Math.sqrt(x);
        
        System.out.println("f(" + x + ")= " +y);
        }
    }