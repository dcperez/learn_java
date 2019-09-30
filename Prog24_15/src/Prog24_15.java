//Program 24_15
import java.util.*;
public class Prog24_15
{
    public static void main(String[] args) {
        int [][] matrix = new int [7][8];
        
        Random rnd = new Random();
        int sum = 0;
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                matrix[i][j] = rnd.nextInt(100);
                System.out.printf("%4d", matrix[i][j]);
                
                sum += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum = " + sum);
    }
}