//Program 12_04: Celcius to Fahrenheit
import java.util.*;

public class Prog12_04
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        
        Double fTemp, cTemp;
        System.out.print("Enter the temperature in Fahrenheit: ");
        fTemp = in.nextDouble();
        
        cTemp = 5.0/9.0 * (fTemp - 32);
        
        System.out.println("The temperature in Celcius is: " + cTemp + " degrees");
    }
}