//Program 13_06: Using String methods
import java.util.*;
public class Prog13_06
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Do you want to end the program? (Yes/No)");
        
        String answer = in.nextLine();
        
        char c = answer.charAt(0);
        
        System.out.println("You entered '" + c + "'");
    }
}
