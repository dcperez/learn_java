/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 10, Section U02

Write a program that populates a java.util.ArrayList variable with 20 random 
integers in [1, 100] and prints the location of the smallest (the minimum) 
integer.
*/
import java.util.*;
public class ArrayListLocation
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int randomNumbers, temp = 0, loc = 0, number, counter = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();

        Random randomNumber = new Random();

        //randomNumbers = randomNumber.nextInt(100)+1;
        temp = randomNumber.nextInt(100) + 1;

        for (int i = 0; i < 20; i++) 
        {

            randomNumbers = randomNumber.nextInt(100) + 1;

            list.add(randomNumbers);

            if (temp > list.get(i)) 
            {

                temp = list.get(i);

                loc = i;
            }
            System.out.print(list.get(i) + " ");

        }
        System.out.println();
        System.out.println("\nThe minimum number is: " + temp + " and is at location: " + loc);
    }
}
