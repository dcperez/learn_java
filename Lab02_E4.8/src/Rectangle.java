/* Write a program that Write a program that asks the user for the lengths of a rectangle’s sides. Then print the area and the perimeter of the rectangle.
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 3, Section U02
*/
import java.util.*;

public class Rectangle
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
               
        
        Double x, y, area, perimeter;
        
        System.out.print("Enter a length for side x: ");
        x = in.nextDouble();
        
        System.out.print("Enter a length for side y: ");
        y = in.nextDouble();
        
        
        area = (x * y);
        perimeter = ( x + x + y + y);
        
        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perimeter);
    }
}