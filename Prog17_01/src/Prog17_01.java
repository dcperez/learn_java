//Program 17_01: Example of SWITCH statement

import java.util.*;
public class Prog17_01
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int number;
        System.out.print("Enter a value between 14 and 17: ");
        
        number = in.nextInt();
        
        switch (number)
        {
            case 14: System.out.println("14 is an even number.");
            break;
            
            case 15: System.out.println("15 is an odd number.");
            break;
            
            case 16: System.out.println("16 is a perfect square.");
            break;
            
            case 17: System.out.println("17 is a prime number.");
            break;
            
            default: System.out.println("I dont know.");
        }
                
    }
}
//SWITCH AND CASES CAN ONLY BE USED USING INT OR STRING TYPES (CHAR IS CONSIDERED AN INTEGER AND CAN BE USED)