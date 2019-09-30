//Program 24_16
import java.util.*;
public class Prog24_16
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
        
        double ave = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            int max = matrix[i][0];
            
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (matrix [i][j] > max) max = matrix[i][j];
            }
                System.out.println("Max = " + max);
                ave += max;
        }
        System.out.printf("Average = %5.2f\n", ave/3);
}
}
       

