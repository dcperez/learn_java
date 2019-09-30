/* Write a program that computes the length of the hypotenuse of a right triangle. The program will prompt the user first to enter the lengths of the other two sides of the triangle. Round your output to one decimal place (use the DecimalFormat class).
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 4, Section U02
*/

import java.util.*;
import java.text.*;
public class Hypotenuse
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Double a, b, c, hypotenuse;
        System.out.println("Enter the lengths of two sides of a triangle: ");
        a = in.nextDouble();
        b = in.nextDouble();
        
        c = Math.pow(a,2) + Math.pow(b, 2);
        hypotenuse = Math.sqrt(c);
        
        DecimalFormat df = new DecimalFormat();
        
        df.setMaximumFractionDigits(1);
        System.out.println("The length of the hypotenuse is: " + df.format(hypotenuse));
        
        
    }
}