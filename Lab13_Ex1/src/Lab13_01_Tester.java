/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 14, Section U02

Write a program that defines and tests a class Square. In the class, there must 
be a method to find the area of the square and a method to print the information
of the Square object. Choose appropriately the instance variable(s) for this 
real-world object and add a default constructor, a parameterized constructor, 
and a toString method.
 */

public class Lab13_01_Tester
{
    public static void main(String[] args) {
   new Lab13_01_Tester();
}
    public Lab13_01_Tester()
    {
        Square s = new Square();
        System.out.println("Area of the square = " + s);
    }
}