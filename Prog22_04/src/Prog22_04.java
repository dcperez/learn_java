//Program 22_04: Mod of Prog17_05

import java.text.DecimalFormat;
import java.util.*;
public class Prog22_04
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        DecimalFormat df2 = new DecimalFormat();
        df2.setMaximumFractionDigits(0);
        
        int option; //option needs to be declared outside do while loop
        do{
            
        System.out.print("Select the number of the conversion you would like to perform: \n1. Inches --> feet and inches \n2. Feet and inches --> decimal feet \n3. Exit \nEnter your option: ");
        option = in.nextInt();
            
        switch (option){
                 case 1: //inches to feet and inches
                System.out.print("You selected to convert from inches --> feet and inches. \nEnter the number of inches: ");
                double inches = in.nextDouble();
                double formFeet = inches/12;
                double formRemainder = inches%12;
                System.out.println(inches + "in = " + df2.format(formFeet) + " ft and " + df.format(formRemainder) + " in.");
                     System.out.println();
                break;
            
            case 2: //feet and inches to decimal feet
                System.out.println("You selected to convert from feet and inches --> decimal feet. \nEnter the number of feet: ");
                double feet = in.nextDouble();
                System.out.println("Enter the number of inches: ");
                inches = in.nextDouble();
                double form2 = feet + (inches/12.0);
                System.out.println(feet + " ft and " + inches + " in. = " + df.format(form2) + " ft.");
                System.out.println();
                break;
                
            case 3: System.out.println("You chose to exit. Goodbye.");
                break;
            
            default: System.out.println("Incorrect choice");
            }
             
        } while (option != 3);
    }
    
}
        
        
        
    

