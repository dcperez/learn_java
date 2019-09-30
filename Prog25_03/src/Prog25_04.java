/* Program 25_04:
Write a Java program that stores 10 random integers (each in [10, 30]) in an 
ArrayList variable and...
- finds and prints the average
- finds and prints the number of values less than the
average
- finds and prints the number of values greater than
the average
*/

import java.util.*;
public class Prog25_04
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        Random rnd = new Random();
        
        int sum = 0;
        int total = 10;
        
        for (int i = 0; i < total; i++)
        {
            list.add(10 + rnd.nextInt(21)); // 31-10 = 21 (remember 31 - last value - isnt counted)
           
            sum += list.get(i);
    }
        double average = (double) sum / total;
        System.out.println(list);
        System.out.println("Average = " + average);
        
        int greaterCount = 0;
        int smallerCount = 0;
        
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) < average)
                smallerCount++;
            else
                if (list.get(i) > average)
                    greaterCount++;
        }
        System.out.println("Number of values less than the average: " + smallerCount);
        System.out.println("Number of values greater than the average: " + greaterCount);
    }
}