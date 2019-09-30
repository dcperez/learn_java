/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 10, Section U02

Write a Java program that adds two 4x4 matrices and prints the resulting matrix.
*/
public class SumOfMatrices
{
    public static void main(String[] args) 
    {
        int a[][] = {{0,1,2,7},
                     {6,0,3,1},
                     {3,1,2,0},
                     {5,1,4,4},};
        
        int b[][] = {{1,1,0,2},
                     {3,4,5,0},
                     {3,2,6,7},
                     {4,0,3,2},};
        
        int add[][] = new int[4][4];
        
           for (int i = 0; i <= a.length - 1; i++) 
        {
            for (int j = 0; j <= b[i].length - 1; j++) 
            {
                add[i][j] = a[i][j] + b[i][j];
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }
    }
}
    



