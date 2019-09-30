//Program 24_13
import java.util.*;
public class Prog24_13
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a size for the matrix: ");
        int size = in.nextInt();
        int [][] matrix = new int [size][size];
   
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
               if (i == j) matrix [i][j] = 1;
               else matrix [i][j] = 0;
               
                
            System.out.printf("%4d", matrix [i][j]);
            
            }
            System.out.println();
    }
}
}