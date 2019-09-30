/* 
Write a program that reads three numbers and prints “all the same” if they are all the same, “all
different” if they are all different, and “neither” otherwise.

Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 5, Section U02
*/

import java.util.*;
public class Three_numbers
{
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
       
        System.out.print("Enter three values: \n");
        
         double x = in.nextDouble();
         double y = in.nextDouble();
         double z = in.nextDouble();
        
        if (x==y && y==z) {
            System.out.println("The three values are all the SAME.");
        }
        else if (x==y || y==z) 
        {
                System.out.println("The three values are NEITHER all the same or all different.");
            }
        else {
            System.out.println("The three values are different.");
        }
    }
    
}
