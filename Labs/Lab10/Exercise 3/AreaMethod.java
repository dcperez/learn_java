/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 10, Section U02

Write a rectangleArea, squareArea, and circleArea methods that calculate and 
print the area of a rectangle, a square, and a circle, respectively.
 */

import java.util.Scanner;

public class AreaMethod {

    public static void main(String[] args) {
        GetArea myArea = new GetArea();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Select a shape to calculate it's area:");
        System.out.println("1. Rectangle ");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Exit");

        int choice = in.nextInt();

        if (choice == 1) {
            System.out.println("Enter the length and width of your rectangle: ");
            double h = in.nextDouble();
            double w = in.nextDouble();
            myArea.retangleArea(h, w);

            System.out.println("\n");
        } else if (choice == 2) {
            System.out.print("Enter the dimension for the side of the Square: ");
            double s = in.nextDouble();
            myArea.square(s);
            System.out.println("\n");
        } else if (choice == 3) {
            System.out.print("Enter the radius of the Circle: ");
            double r = in.nextDouble();
            myArea.circleArea(r);
            System.out.println("\n");
        } else if (choice == 4) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Input Error!");
        }
    }
}

class GetArea {

    Scanner in = new Scanner(System.in);

    public void retangleArea(double h, double w) {

        double area = h * w;
        System.out.println("The area of the rectangle is: " + area);
    }

    public void square(double s) {

        double square = Math.pow(s, 2);
        System.out.printf("The area of the square is: %.2f", square);
    }

    public void circleArea(double r) {
        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("The area of the circle is: %.2f", area);
    }

}
