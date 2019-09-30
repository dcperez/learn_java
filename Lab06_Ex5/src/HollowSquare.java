/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 7, Section U02

Write a program that reads an integer and displays, using asterisks, a hollow square.
*/
import java.util.*;
public class HollowSquare
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the length of the side: ");
        int side = in.nextInt();
        
        if (side >= 1)
        {
            for (int i = 1; i <= side; i++)
            {
                for (int j = 1; j <= side; j++)
                {
                    if (j == 1 || j == side || i == 1 || i == side) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
        else System.out.println("Enter an integer greater than 0.");
    }
}

