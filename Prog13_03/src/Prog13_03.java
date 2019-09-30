//Program 13_03 Fahrenheit to Celcius with Decimal Formatter
import java.util.*;
import java.text.*;
import java.lang.Math;



public class Prog13_03
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        
        Double fTemp, cTemp;
        System.out.print("Enter the temperature in Fahrenheit: ");
        fTemp = in.nextDouble();
        
        cTemp = 5.0/9.0 * (fTemp - 32);
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        
        System.out.println("The temperature in Celcius is: " + cTemp + " degrees");
        System.out.println("The temperature in Celcius with only 2 decimal places is: " + df.format(cTemp) + " degrees");
        
    }
}