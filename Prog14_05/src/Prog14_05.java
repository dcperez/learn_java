//Program14_05: nextLine vs next
import java.util.*;
public class Prog14_05
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter two words separated by one space: ");
        String s1 = in.nextLine();
        System.out.println("You entered: " + s1);
        //nextLine(): reads input until the end of line
        
        System.out.println("Enter two words separated by one space: ");
        String s2 = in.next();
        System.out.println("You entered: " + s2);
        //next(): reads input until first white space
    }
}