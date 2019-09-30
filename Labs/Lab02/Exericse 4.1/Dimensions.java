/* Write a program that displays the dimensions of a letter-size (8.5 × 11 inches) sheet of paper in millimeters.
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 3, Section U02
*/
import java.util.*;

public class Dimensions
{
    public static void main (String args[])
    {
      double width1 =  8.5;
      double length1 = 11;
      
      //25.4 mm = 1 inch
      
      double width2 = width1 * 25.4;
      double length2 = length1 * 25.4;
              
      
        System.out.println("The dimensions of a letter size sheet of paper in millimeters is: " + width2 + " x " + length2 );
          
    }
}