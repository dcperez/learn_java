/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 6, Section U02

Write a program that reads a letter grade and displays “Excellent” if the letter is an A, “Good” if it is a
B, “You can do better!” if it’s a C, “I’m afraid that’s not good” if it’s a D or F, and “Input Error!” in any
other case. Implement a solution using only IF statements.
*/
import java.util.*;
public class Grades_IF
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a letter grade: ");
         String grade = in.nextLine();
         
        if ("A".equals(grade.toUpperCase())){
            System.out.println("Excellent!");
        }
        else if ("B".equals(grade.toUpperCase())){ 
            System.out.println("Good!");
        }
        else if ("C".equals(grade.toUpperCase())){
            System.out.println("You can do better!");
        }
        else if ("D".equals(grade.toUpperCase()) || "F".equals(grade.toUpperCase())){
            System.out.println("I'm afraid that's not good.");
        }
        else System.out.println("Input Error!");
    }
}
        
        
        
        
 