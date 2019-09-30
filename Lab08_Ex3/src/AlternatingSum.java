/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 9, Section U02

E7.5 Write a program that computes the alternating sum of all elements in an 
array. For example, if the array elements are 1 4 9 16 9 7 4 9 11,
then it computes: 1 – 4 + 9 – 16 + 9 – 7 + 4 – 9 + 11 = –2
*/
import java.util.*;

public class AlternatingSum
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the elements an array: ");
        System.out.println("\nFor example: 1 4 9 16 9 7 4 9 11 and press ENTER");

        Scanner in = new Scanner(System.in);
        String arrayElements = in.nextLine();
        String[] nums = arrayElements.split(" ");

        int[] intArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            intArray[i] = Integer.parseInt(nums[i]);
        }
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 == 0) 
            {
                sum += intArray[i];
                if (i != 0) 
                {
                    System.out.print(" + " + intArray[i]);
                } else {
                    System.out.print(intArray[i]);
                }
            } else 
            {
                sum -= intArray[i];
                System.out.print(" - " + intArray[i]);
            }
        }
        System.out.println(" = " + sum);
    }
}
  