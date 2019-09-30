//Program 16_07: Nested if and between two numbers

import java.util.*;
public class Prog16_07
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        if (n>0) //positive number
        {
            System.out.print("The number is positive");
            
            if (n >= 1 && n<= 100){
                System.out.println(" and is between 1 and 100");
            }
        }
        else{
            System.out.println("The number is zero or negative");
        }
    }
}