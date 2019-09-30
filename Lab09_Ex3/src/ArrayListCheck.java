/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 10, Section U02

Write a program that populates a java.util.ArrayList variable with 10 random 
integers in [1, 20], asks the user to provide a value, and counts how many 
numbers are equal to the value entered by the user.
*/

import java.util.*;
public class ArrayListCheck
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int randomNumbers, number, count = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random randomNumber = new Random();
        
        for (int i = 0; i < 10; i++) 
        {
            randomNumbers = randomNumber.nextInt(20) + 1;
            list.add(randomNumbers);
        }
        
        System.out.print("Please enter a number: ");
        number = in.nextInt();
        
        for (int i = 0; i < 10; i++) 
        {
            if (number == list.get(i)) 
            {
                count++;
            }
        }
        System.out.println("\n" + list + "\n");
        System.out.println("You have " + count + " match(es) from the ArrayList");
    }

}

