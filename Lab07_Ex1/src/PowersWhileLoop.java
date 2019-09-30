/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 8, Section U02

A variation of E6.2 c. Write a program that computes all powers of 2 from 20 up to 220, using a WHILE loop.
*/
public class PowersWhileLoop
{
    public static void main(String[] args) {
        
        int i = 0;
        while (i<=20)
                {
                    System.out.println("2^" + i + " = " + Math.pow(2,i));
                    i++;
                }
    }
}