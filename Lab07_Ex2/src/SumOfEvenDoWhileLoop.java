/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 8, Section U02

A variation of E6.2 a. Write a program that computes the sum of all even numbers between 2 and 100 (inclusive), using a DO-WHILE loop.
*/
public class SumOfEvenDoWhileLoop
{
    public static void main(String[] args) {
        
        int i = 0;
        int sum = 0;
        
        do {
            sum = sum +i;
            i+=2;
            }
        
        while (i<=100);
        System.out.println("Sum = " + sum);
    }
    
}