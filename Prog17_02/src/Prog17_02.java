//Program 17_02: CASES ASKING Y OR N

import java.util.*;
public class Prog17_02
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Do you want to continue <Y/N>");
        char answer = in.nextLine().charAt(0);
        
        //switch (answer)
        switch (answer)
        {
            case 'n':
            case 'N':
                System.out.println("Halting...");
                break;
                
            case 'y':
            case 'Y':
                System.out.println("Continuing...");
                break;
            default: System.out.println("Please enter \"Y\" or \"N\"");
        }
    }
}