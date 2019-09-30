/*Program 26_10: Write a getPositiveInt method that ask the user to enter a positive
integer number and then returns it. If the number is 0 or negative, the method will return -1.
*/
import java.util.*;
public class Prog26_10
{
    public static void main(String[] args) {
        
        new Prog26_10();
    }
    
    public Prog26_10()
    {
      int n = getPositiveInt(); 
      if (n ==-1){
          System.out.println("Incorrect input!");
      }
      else System.out.println("You entered: " + n);
    }
    
    public int getPositiveInt()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        
        if (x <= 0)
        {
            return -1;
        }
        
        else {return x;
        }
                
    }
}