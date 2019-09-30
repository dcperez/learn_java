/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 9, Section U02

Write a program that fills an array with 20 random integers in [1, 100] and 
prints the location in the array of the smallest (the minimum) integer.
*/
import java.util.*;

public class LocationCheck
{
    public static void main(String[] args) {
        int counter = 0;
        int temp;
        int loc = 0;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        int[] randomIntegers = new int[20];

        randomIntegers[0] = 1+ rand.nextInt(100);
        
        temp = randomIntegers[0];

        for (int i = 0; i < 20; i++) {
            
            randomIntegers[i] = 1+rand.nextInt(100);

            if (temp > randomIntegers[i]) {

                temp = randomIntegers[i];
                loc = i;
            }
            System.out.println(randomIntegers[i] + "");

        }
        System.out.println("\nThe minimum number is: " + temp + " and is at location: " + loc);
    }

}