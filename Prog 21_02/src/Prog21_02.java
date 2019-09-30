//Program 21_02: While Loops (Yes and No)
import java.util.*;
public class Prog21_02
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String answer = "y";
        while (answer.equals("Y") || answer.equals("y"))
        {
            System.out.println("Want to see me again <Y/N>?");
            answer = in.nextLine();
        }
        System.out.println("Bye");
    }
}