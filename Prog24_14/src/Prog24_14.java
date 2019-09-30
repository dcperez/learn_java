//Program 24_14: Initializing a 2D array
public class Prog24_14
{
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}