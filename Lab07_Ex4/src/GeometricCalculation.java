/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 8, Section U02

A variation of Exercise 3 in Lab 5 Write a program that presents the user a menu
of four choices, “Circle”, “Square”, “Rectangle”, and “Exit” to calculate the 
area of one of these geometric objects. Once a choice is made, the program would
ask the user for the data required to do the calculation. For example, if the 
user input were “Circle”, the program would prompt the user to enter the value 
of the radius of the circle. The program will let the user run area calculations
until “Exit” is entered. Use a WHILE or a DO-WHILE loop.
*/

import java.text.DecimalFormat;
import java.util.*;
public class GeometricCalculation
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        DecimalFormat df2 = new DecimalFormat();
        df2.setMaximumFractionDigits(0);
        
        int option; //option needs to be declared outside do while loop
        do{
            
        System.out.print("Select the number of the geometric calculation you would like to perform: \n1. Circle \n2. Square \n3. Rectangle \n4. Exit \nEnter your option: ");
        option = in.nextInt();
        System.out.println();
            
        switch (option){
                 case 1: //Circle
                System.out.print("You selected Circle. Enter the radius: ");
                double radius = in.nextDouble();
                double circle = Math.PI * radius;
                System.out.println("The area of the circle is: " + df.format(circle));
                     System.out.println();
                break;
            
            case 2: //Square
                System.out.print("You selected Square. Enter the length of the side: ");
                double side = in.nextDouble();
                double square = Math.pow(side, 2);
                System.out.println("The area of the square is: " + df.format(square));
                System.out.println();
                break;
                
            case 3: //Rectangle 
                System.out.println("You selected Rectangle. Enter the two sides of the rectangle: ");
                double x = in.nextDouble();
                double y = in.nextDouble();
                double rectangle = x * y;
                System.out.println("The area of the rectangle is: " + df.format(rectangle));
                System.out.println();
                break;
            
                case 4: //Exit
                    System.out.println("You chose to exit. Goodbye.");
                break;
                
            default: System.out.println("Incorrect choice");
            }
             
        } while (option != 4);
    }
    
}
        
        
        
    

