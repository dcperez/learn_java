/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 10, Section U02

Write a Java program that fills a 3x4 matrix with random numbers in [0, 9] and 
calculates the sum of the elements in each row.
*/

import java.util.*;
public class SumOfRows
{
    public static void main(String[] args) {
        int [][] matrix = new int [3][4];
        
        Random rnd = new Random();
        for (int i = 0;i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                matrix [i][j] = rnd.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                sum += matrix[i][j];
            }
            System.out.println("Sum = " + sum);
            sum = 0;
        }
    }
}


       

