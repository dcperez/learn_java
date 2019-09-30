/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 7, Section U02

Write a program that reads a line of input as a string and prints the string, with all vowels replaced by an underscore.
*/
import java.util.*;
public class VowelReplacement
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        
        for (int i = 0; i < str.length(); i++)
        {
            if (str.toUpperCase().charAt(i) == 'A' || str.toUpperCase().charAt(i) == 'E' || str.toUpperCase().charAt(i) == 'I' || str.toUpperCase().charAt(i) == 'O' || str.toUpperCase().charAt(i) == 'U')
                System.out.print("_");
            else System.out.print(str.charAt(i));
        }
        System.out.println("");
    }
}
