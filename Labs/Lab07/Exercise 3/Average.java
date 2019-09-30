/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 8, Section U02

Write a program that computes the average of a list of numbers entered by the 
user. The numbers are supposed to be in the range 50 – 100 (inclusive) and the 
user will indicate that he/she is done with data input by entering a value not 
in that range. At least one number will be in the range. Use a WHILE or a 
DO-WHILE loop.
*/
import java.util.*;
public class Average
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
       double  sum = 0;
       double number = 50;
       double i = 0;
        
        
        while (number >= 50 && number <= 100)
        {
            
            System.out.println("Enter a number: ");
            number = in.nextInt();
            if (number < 50 || number > 100)
            {
                break;
            }
            else sum += number;
            i++;
        }
        double average = (sum/i);
        System.out.println(average);
              
    }
    
}

        
        
            
        

    

