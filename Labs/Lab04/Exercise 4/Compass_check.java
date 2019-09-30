/* 
A compass needle points a given number of degrees away from North, measured clockwise.
Write a program that reads the angle and prints out the nearest compass direction; one of N, NE, E, SE,
S, SW, W, NW. In the case of a tie, prefer the nearest principal direction (N, E, S, or W).

Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 5, Section U02
*/

import java.util.Scanner;
public class Compass_check
{
    public static void main(String []args)
    {
        Scanner in= new Scanner(System.in);
        double angle;
        System.out.println("Please enter an angle: ");
       
        angle=in.nextDouble();
        if (angle>=0 && angle<=22.5)
        {
            System.out.println("You are heading NORTH");
        }
        else if(angle>22.5 && angle<67.5)
        {
            System.out.println("You are heading NORTH-EAST ");
        }
        else if(angle>=67.5 && angle<=112.5)
        {
            System.out.println("You are heading EAST ");
        }
        else if(angle>112.5 && angle<157.5)
        {
            System.out.println("You are heading SOUTH-EAST ");
        }
        else if(angle>=157.5 && angle<=202.5)
        {
            System.out.println("You are heading SOUTH");
        }
        else if(angle>202.5 && angle<247.5)
        {
            System.out.println("You are heading SOUTH-WEST");
        }
        else if(angle>=247.5 && angle<=292.5)
        {
            System.out.println("You are heading WEST");
        }
        else if(angle>292.5 && angle<337.5)
        {
            System.out.println("You are heading NORTH-WEST");
        }
        else if(angle>=337.5 && angle<=360)
        {
            System.out.println("You are heading NORTH");
        }
    }
}