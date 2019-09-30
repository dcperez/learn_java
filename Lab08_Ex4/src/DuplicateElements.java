/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 9, Section U02

A variation of E7.10 Write a program that determines if an array contains two adjacent duplicate elements.
*/
import java.util.*;
public class DuplicateElements
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
        int [] values = {8, 8, 25, 32, 76};
        
        int x = 0;
        for (int i = 0; i < 4; i++)
        {
              if (values [i] == values[i+1])
                  {
                      System.out.println("There are duplicate values.");
                      x = 1;
                  }
        }
            if (x == 0)
            {
            System.out.println("There are no duplicate values.");
            }
        System.out.println();
    }
}
    


    
