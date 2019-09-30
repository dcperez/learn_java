//Program 12_05: Using the Math class

import java.util.*;
public class Prog12_05
{
    public static void main (String args[])
    {
        double sphereVolume, rad;
        
        Scanner cin = new Scanner(System.in);
        
        System.out.print("Enter the radius of the sphere: ");
        
        rad = cin.nextDouble();
        //Volume of a sphere = (4*Pi*r^3)/3
        sphereVolume = 4 * Math.PI * Math.pow(rad, 3)/3;
        
        System.out.println("The vol. of the sphere is: " + sphereVolume);
    }
}