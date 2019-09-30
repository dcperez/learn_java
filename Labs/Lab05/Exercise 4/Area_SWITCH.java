/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 6, Section U02

Rewrite your solution to Exercise 3 using a SWITCH statement this time
*/
import java.util.*;
public class Area_SWITCH
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the letter corresponding to the geometric object to calculate it's area.\nA. Circle \nB. Square \nC. Rectangle \nD. Exit \nEnter your option: ");
        String option = in.nextLine();
        
        switch (option.toUpperCase())
        {
            case "A": 
                System.out.print("You selected Circle. Enter the radius: ");
                double radius = in.nextDouble();
                double circle = Math.PI * radius;
                System.out.println("The area of the circle is: " + circle);
                break;
                
            case "B": 
                System.out.print("You selected Square. Enter the length of the side: ");
                double side = in.nextDouble();
                double square = Math.pow(side, 2);
                System.out.println("The area of the square is: " + square);
                break;
                
            case "C":
                System.out.println("You selected Rectangle. Enter the two sides of the rectangle: ");
                double x = in.nextDouble();
                double y = in.nextDouble();
                double rectangle = x * y;
                System.out.println("The area of the rectangle is: " + rectangle);
                break;
                
            case "D":
                System.out.println("You selected to exit. Goodbye.");
                break;
                
            default: System.out.println("You did not select one of the choices. Please try again.");
        }
    }
}