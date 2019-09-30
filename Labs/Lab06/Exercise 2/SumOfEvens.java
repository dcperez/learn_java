/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 7, Section U02

Write a program that computes the sum of all even numbers between 2 and 100 (inclusive)
*/
public class SumOfEvens
{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i+=2){
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}