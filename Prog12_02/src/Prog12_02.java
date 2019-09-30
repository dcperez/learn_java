//Program 12_02: Celsius - Fahrenheit conversion
import java.util.*;

public class Prog12_02
{ 
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        
        double cTemp, fTemp;
        System.out.print("Enter a Celcius temperature: ");
        cTemp = in.nextDouble();
        
        fTemp = 9.0/5.0 * cTemp + 32.0;
        
        System.out.println("The Fahrenheit temp is " + fTemp + " degrees");
    }
}