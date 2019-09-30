/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 6, Section U02

Write a program that presents the user a menu of four choices: circle, square, rectangle, exit. Calculate the area of one of these geometric objects. Once a choice is made, the program would ask
the user for the data required to do the calculation. For example, if the user input were “Circle”, the
program would prompt the user to enter the value of the radius of the circle. Implement a solution using
only IF statements
*/
import java.util.*;
public class Area_IF
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the letter corresponding to the geometric object to calculate it's area.\nA. Circle \nB. Square \nC. Rectangle \nD. Exit \nEnter your option: ");
        String option = in.nextLine();

        if ("A".equals(option.toUpperCase()))
        {
            System.out.print("You selected Circle. Enter the radius: ");
            double radius = in.nextDouble();
            double circle = Math.PI * radius;
            System.out.println("The area of the circle is: " + circle);
        }
        
        else if ("B".equals(option.toUpperCase()))
        {
            System.out.print("You selected Square. Enter the length of the side: ");
            double side = in.nextDouble();
            double square = Math.pow(side, 2);
            System.out.println("The area of the square is: " + square);
        }
        
        else if ("C".equals(option.toUpperCase()))
        {
            System.out.println("You selected Rectangle. Enter the two sides of the rectangle: ");
            double x = in.nextDouble();
            double y = in.nextDouble();
            double rectangle = x * y;
            System.out.println("The area of the rectangle is: " + rectangle);
        }
        
        else if ("D".equals(option.toUpperCase()))
        {
            System.out.println("You selected to exit. Goodbye.");
        }
        
        else System.out.println("You did not select one of the choices. Please try again.");
    }
}
