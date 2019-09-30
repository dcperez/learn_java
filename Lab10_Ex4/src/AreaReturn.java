/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 10, Section U02

(This exercise is a variation of the previous one) Write a rectangleArea, 
squareArea, and circleArea methods that calculate and return the area of a 
rectangle, a square, and a circle, respectively. 
 */

import java.util.Scanner;

public class AreaReturn {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Select a shape to calculate it's area:");
        System.out.println("1. Rectangle ");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Exit");

        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println("Enter the length and width of your rectangle: ");
            double w = in.nextDouble();
            double h = in.nextDouble();

            new GetAreas(w, h);
        } else if (choice == 2) {
            System.out.print("Enter a dimension for the side of the square: ");
            double s = in.nextDouble();
            GetAreas squareArea = new GetAreas(s);
            System.out.printf("The area of the square is: %.2f", squareArea);
            System.out.println();

        } else if (choice == 3) {
            new GetAreas();
            System.out.println();
        } else if (choice == 4) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Input Error!");
        }
    }
}

class GetAreas {

    Scanner in = new Scanner(System.in);

    public GetAreas() {

        System.out.println("Circle area is: " + circleArea());

    }

    public GetAreas(double x) {
        square(x);
    }

    public GetAreas(double x, double y) {
        rectangleArea(x, y);
        System.out.println("The area of the rectangle is: " + rectangleArea(x, y));
    }

    public double rectangleArea(double h, double w) {

        return h * w;
    }

    public double square(double s) {

        return Math.pow(s, 2);
    }

    public double circleArea() {
        System.out.print("Enter the radius of the circle: ");
        double r = in.nextDouble();
        return Math.PI * Math.pow(r, 2);

    }

}
