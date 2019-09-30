//Pair Programming w/ Baba

import java.util.*;
public class Pennies
{
    public static void main (String args[])
    { 
        double dollars, quarters, dimes, nickels, pennies, lopennies;
        Scanner in = new Scanner(System.in);
        
        System.out.println("How many pennies are in your piggy bank?");
        pennies = in.nextDouble();
   
        dollars = pennies/100;
        lopennies = pennies%100;
        quarters = lopennies/25;
        
        
        
    }
}
