import java.util.*;

public class Prog09_04
{ 
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String firstName = in.nextLine();
        
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        
        String output = firstName + " " + lastName;
        
        System.out.println("Your full name is: " + output);
    }
}