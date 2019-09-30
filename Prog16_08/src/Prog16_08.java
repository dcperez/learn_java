//Program 16_08

import java.util.*;
public class Prog16_08
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int year;
        System.out.print("Enter a person's year of birth: ");
        year = in.nextInt();
        
        if (year < 1990){
            System.out.println("The person was born before 1990."); 
        }
        else if (year > 1999){
            System.out.println("The person was born after 1990.");
        } 
        else if (year >=1990 && year<=1999){
            System.out.println("The person was born in the 90s."); 
        }
    }
}