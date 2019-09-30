import java.util.*;
public class DigitCheck
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String str = "";
        int number = 0;
        
        do
        {
            System.out.print("Enter a number: ");
            number = in.nextInt();
            
            if (number > 0 && number < 10)
            {
                System.out.println(number + " is one digit.");
            }
            else 
                if (number >= 10 && number < 100)
                {
                    System.out.println(number + " is two digits.");
                }
                else
                    if (number >=100 && number < 1000)
                    {
                        System.out.println(number + " is three digits.");
                    }
        }
            System.out.println("Do you want to try again?");
            str = in.nextLine();
        }
            while (str.toUpperCase().equals("YES"));
            
        System.out.println("Bye!");
        }
}

