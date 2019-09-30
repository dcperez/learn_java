//Program 26_06: Passing Values to a Method
import java.util.*;

public class Prog26_06
{
    public static void main(String[] args) {
        
        new Prog26_06();
    }
    
    public Prog26_06()
    {
        writeHello();
        String name = getName();
        welcomeMessage(name);
    }
    
    public void writeHello()
    {
        System.out.println("Hello!");
    }
    
    public String getName()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String s = in.nextLine();
        
        return s; // variable s is returned and passed to String name
    }
    
    public void welcomeMessage(String s)
    {
        System.out.println("Welcome aboard, " + s + "!");
    }
}