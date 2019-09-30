//Program 18_01: Conditional Operator
import java.util.*;
public class Prog18_01
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter values for a and b: ");
        
        int a = in.nextInt();
        int b = in.nextInt();
        
        int max = (a>=b) ? a:b;
        /* Better than writing if (a>=b) max = a;
                                else max = b; */
        System.out.println("The maximum is: " + max);
        //to do minimum you switch the sign to <=
    }
}