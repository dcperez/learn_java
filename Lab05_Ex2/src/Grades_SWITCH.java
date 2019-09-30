/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 6, Section U02

Rewrite your solution to Exercise 1 using a SWITCH statement this time.
*/
import java.util.*;
public class Grades_SWITCH
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a letter grade: ");
        String grade = in.nextLine();
        
        switch (grade.toUpperCase()){
            case "A":
                System.out.println("Excellent!");
                break;
                
            case "B":
                System.out.println("Good!");
                break;
                
            case "C":
                System.out.println("You can do better!");
                break;
                
            case "D":
            case "F":
                System.out.println("I'm afraid that's not good.");
                break;
                
            default: System.out.println("Input Error!");                
        }
    }
}
