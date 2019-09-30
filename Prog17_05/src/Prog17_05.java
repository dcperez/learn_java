//Program 17_05: Write a program that converts distance values. The program should give the user 3 options: convert inches to feet and inches, convert feet and inches to decimal feet, or exit. Use a switch statement to implement the options.
import java.util.*;
import java.text.*;
public class Prog17_05
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        DecimalFormat df2 = new DecimalFormat();
        df2.setMaximumFractionDigits(0);
        
        System.out.print("Select the number of the conversion you would like to perform: \n1. Inches --> feet and inches \n2. Feet and inches --> decimal feet \n3. Exit \nEnter your option: ");
        int option = in.nextInt();
        
        switch (option){
            case 1: //inches to feet and inches
                System.out.print("You selected to convert from inches --> feet and inches. \nEnter the number of inches: ");
                double inches = in.nextDouble();
                double formFeet = inches/12;
                double formRemainder = inches%12;
                System.out.println(inches + "in = " + df2.format(formFeet) + " ft and " + df.format(formRemainder) + " in.");
                break;
            
            case 2: //feet and inches to decimal feet
                System.out.println("You selected to convert from feet and inches --> decimal feet. \nEnter the number of feet: ");
                double feet = in.nextDouble();
                System.out.println("Enter the number of inches: ");
                inches = in.nextDouble();
                double form2 = feet + (inches/12.0);
                System.out.println(feet + " ft and " + inches + " in. = " + df.format(form2) + " ft.");
                break;
            
            case 3: System.out.println("You chose to exit. Goodbye.");
            
            default: System.out.println("Incorrect choice");
        }
        
    }
}