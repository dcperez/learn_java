//Program 21_05
import java.util.*;
public class Prog21_05
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String answer = "", str = ""; //create empty strings
        while (!answer.toUpperCase().equals("BYE"))
        {
            System.out.println("Enter a string <To finish enter 'bye'>:");
            answer = in.nextLine();
            
            if (answer.equals("")) continue;
            
            if (!answer.toUpperCase().equals("BYE")) str += answer + " ";
        }
        System.out.println(str);
        
    }
}
