/* 
Write a Java program that determines if a person’s age is less than 20, in the [20, 30] range, or greater
than 30.

Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 5, Section U02
*/

import java.util.*;
public class Age
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int age;
        System.out.print("Enter a person's age between 20 and 30: ");
        age = in.nextInt();
        
        if (age < 20){
            System.out.println("The person's age is less than 20 years old."); 
        }
        if (age > 30){
            System.out.println("The person's age is greater than 30 years old."); 
        }
        if (age >=20 && age<=30){
            System.out.println("The person's age is between 20 and 30 years old."); 
        }
    }
}