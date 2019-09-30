//Program 13_02: Using DecimalFormat class to format output
import java.util.*;
import java.text.*;

public class Prog13_02
{
public static void main (String args[])
{
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the radius of a circle: ");
    double radius = input.nextDouble();
    double area = Math.PI * Math.pow(radius, 2);
    
    DecimalFormat df = new DecimalFormat();
    
    df.setMaximumFractionDigits(2);
    
    System.out.println("Area = " + area);
    System.out.println("Area = " + df.format(area));
}
}