//Program 17_04: Write a program that asks the user to enter a month and then prints the astronomical season(s) the month is in (Spring, Summer, Fall, Winter) for the Northern Hemisphere.

import java.util.*;
public class Prog17_04
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a month: ");
        String month = in.nextLine();
        
        switch(month.toUpperCase()){
            case "JANUARY":
            case "FEBRUARY":
                System.out.println("The month is in Winter.");
                break;
                
            case "APRIL":
            case "MAY":
                System.out.println("The month is in Spring.");
                break;
                
            case "JULY":
            case "AUGUST":
                System.out.println("The month is in Summer.");
                break;
                
            case "OCTOBER":
            case "NOVEMBER":
                System.out.println("The month is in Fall.");
                break;
                
            case "DECEMBER":
                System.out.println("The month is in Fall and Winter.");
                break;
                
            case "MARCH":
                System.out.println("The month is in Winter and Spring.");
                break;
                
            case "JUNE":
                System.out.println("The month is in Spring and Summer.");
                break;
                
            case "SEPTEMBER":
                System.out.println("The month is in Summer and Fall.");
                break;
                
            default : System.out.println("Input Error!");
        }
    }
}