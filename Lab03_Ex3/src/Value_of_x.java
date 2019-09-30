/* Write a program that prompts the user for a value of x and then calculates the given equation
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 4, Section U02
*/
import java.util.*;

public class Value_of_x
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Double x, answer;
        System.out.print("Provide a value of x: ");
        x = in.nextDouble();
        
        answer = (1 + x + (Math.pow(x, 2)/2) + (Math.pow(x, 3)/6) + (Math.pow(x, 4)/24));
        
        System.out.println("Answer is: " + answer);
    }
}