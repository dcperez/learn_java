/* Write a program that prompts the user for two doubles and then prints their average.
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 3, Section U02
*/
import java.util.*;

public class Average
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        
        double valueOne, valueTwo, average;
        System.out.print("Enter the first value: ");
        valueOne = in.nextDouble();
        
        System.out.print("Enter the second value: ");
        valueTwo= in.nextDouble();
        
        average = (valueOne + valueTwo)/2;
        
        System.out.println("The average is: " + average);
    }
}