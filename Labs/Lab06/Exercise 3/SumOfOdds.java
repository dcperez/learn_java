/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 7, Section U02

Write a program that computes the sum off all odd numbers between a and b (inclusive), where a and b are inputs.
*/
import java.util.*;
public class SumOfOdds
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an odd number: ");
        int a = in.nextInt();
        System.out.print("Enter another odd number: ");
        int b = in.nextInt();
        
        int sum = 0;
        for (int i = a; i <= b; i+=2){
            sum += i;
        }
         System.out.println("Sum = " + sum);
    }
}