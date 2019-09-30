/* 
Write a program that reads an integer and prints whether it is negative, zero, or positive.

Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 5, Section U02
*/
import java.util.*;
public class Integer_reader
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        
        int x;
        x = in.nextInt();
        
        if (x < 0){
            System.out.println("Integer is negative.");
        }
        else if (x > 0){
            System.out.println("Integer is positive.");
        }
        else {
            System.out.println("Integer is zero.");
        }
        
        
    }
}