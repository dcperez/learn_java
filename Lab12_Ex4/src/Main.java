/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 13, Section U02

Create a project that incorporates the classes created in exercises 1) and 3) 
as well as the class Circle and the class Sphere implemented in the lecture. 
Write a class Main that tests all of these classes.

 */

public class Main
{
    public static void main(String[] args) {
   new Main();
}
    public Main()
    {
        System.out.println("Radius and area of circle");
        Circle c = new Circle();
        c.printCircle();
        System.out.println();
        
        System.out.println("Area and perimeter of a rectangle");
        Rectangle r = new Rectangle();
        r.printRectangle();
        System.out.println();
        
        System.out.println("Volume and surface area of a sphere");
        Sphere sph = new Sphere();
        sph.printSphere();
        System.out.println();
        
        System.out.println("Area of a square");
        Square sq = new Square();
        sq.printSquare();
        
    }
}