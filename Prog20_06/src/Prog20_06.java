//Program 20_06: Write a program that inputs a list of 10 numbers from the user and calculates the minumum value in the list.
import java.util.*;
public class Prog20_06
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int number, min;
        System.out.print("Enter a number: ");
        min = in.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.print("Enter a number: ");
            number = in.nextInt();
            
            if (number < min){
                min = number;
            }
            System.out.println("Min = " + min);
        }
    }         
}