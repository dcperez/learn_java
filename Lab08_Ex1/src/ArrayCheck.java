/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 9, Section U02

Write a program that fills an array with 10 random integers in [1, 20], asks the
user to provide a value, and counts how many numbers in the array are equal to 
the value entered by the user
*/
import java.util.*;

public class ArrayCheck
{
    public static void main(String[] args) {
        int counter = 0;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();
        
        int[] randomIntegers = new int[10];

        System.out.print("Provide a value: ");

        int value = in.nextInt();
        for (int i = 0; i < randomIntegers.length; i++) {
            randomIntegers[i] = 1 + rand.nextInt(20);

            if (value == randomIntegers[i]) {
                counter++;
            }
            System.out.println(randomIntegers[i] + "");

        }
        System.out.println("You have " + counter + " matches");
    }

}