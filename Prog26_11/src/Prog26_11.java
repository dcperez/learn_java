//Program 26_11: 
import java.util.*;
public class Prog26_11
{
    public static void main(String[] args) {
         
        new Prog26_11();
    }
    
    public Prog26_11()
    {
        System.out.println("4! = " + factorial(4));
    }
    
    public int factorial(int n)
    {
        int fact = 1;
        
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }
}