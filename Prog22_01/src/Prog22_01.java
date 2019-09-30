//Program 22_01: Do while loop
import java.util.*;
public class Prog22_01
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String answer;
        
        do 
        {
            System.out.println("Want to see me again <Y/N>?");
            answer = in.nextLine();
        } while (answer.equals("Y") || answer.equals("y"));
        System.out.println("Bye!");
    }
}