/* Write a program that asks, stores, and concatenates the user's e-mail and postal address, then prints the output.
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 3, Section U02
*/
import java.util.*;

public class Address
{ 
    public static void main (String args[])
    { 
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your e-mail address: ");
        String email = in.nextLine();
        
        System.out.print("Enter your home address: ");
        String postalAddress = in.nextLine();
        
        String output = "Your e-mail address is " + email + ", and your postal address is " + postalAddress + ".";
        
        System.out.println(output);
        
        
    }
}