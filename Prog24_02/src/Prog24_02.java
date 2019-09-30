//Program 24_02
import java.util.*;
public class Prog24_02
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] bills = new double [12];
        
        for (int i = 0; i < 12; i++)
        {
            System.out.println("Enter the bill for month " + (i+1) + ": $");
            bills[i] = in.nextDouble();
        }
        
        System.out.println("\nYour bills for the year are\n");
         for (int i = 0; i < 12; i++)
         {
             System.out.println("Month " + (i + 1) + ": $" + bills[i]);
         }
    }
}