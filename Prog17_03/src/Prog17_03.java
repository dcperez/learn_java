//Program 17_03

import java.util.*;
public class Prog17_03
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Do you want to continue <Y/N>");
        String answer = in.nextLine();
        
        //switch (answer)
         switch (answer.toUpperCase())   
        {
            //case "no":
            //case "No":
             case "NO":
                System.out.println("Halting...");
                break;
                
            //case "yes":
            //case "Yes":
             case "YES":
                System.out.println("Continuing...");
                break;
            default: System.out.println("Please enter \"Yes\" or \"No\"");
        }
    }
}