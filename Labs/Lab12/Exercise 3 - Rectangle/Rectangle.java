public class Rectangle
{
    public double side1 = 2;
    public double side2 = 4;
    
    public double area()
    {
        return side1 * side2;
    }
    
    public double perimeter()
    {
        return (side1*2) + (side2*2);
    }
    public void printRectangle()
    {
        System.out.println("Area: " + area() + ", Perimeter: " + perimeter());
    }
}