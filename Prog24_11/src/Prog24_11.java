//Program 24_11: 2D arrays
public class Prog24_11
{
    public static void main(String[] args) {
        int [][] matrix = new int [3][4];
        
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                matrix[i][j] = 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}