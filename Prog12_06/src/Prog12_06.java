//Program 12_06: Write a program to calculate the distance between two points in the plane, (x1,y1) and (x2,y2)
import java.util.*;
public class Prog12_06
{
    public static void main (String args[])
    {
        double x1, y1, x2, y2, distance;
        
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Enter a value of x1: ");
        x1 = cin.nextDouble();
        
        System.out.print("Enter a value of y1: ");
        y1 = cin.nextDouble();
        
        System.out.print("Enter a value of x2: ");
        x2 = cin.nextDouble();
        
        System.out.print("Enter a value of y2: ");
        y2 = cin.nextDouble();
        
        distance = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2, 2));
        
        System.out.println("The distance between both points is: " + distance);
    }
}