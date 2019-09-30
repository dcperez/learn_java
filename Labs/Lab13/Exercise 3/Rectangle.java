public class Rectangle
{
    private double side1;
    private double side2;
    
    public Rectangle()
    {
        side1 = 4;
        side2 = 7;        
    }
    public Rectangle(double s1, double s2)
    {
        side1 = s1;
        side2 = s2;
    }
    public double getSide1()
    {
        return side1;
    }
    public double getSide2()
    {
        return side2;
    }
    public void setSides(double s1, double s2)
    {
        side1 = s1;
        side2 = s2;
    }
    public double area()
    {
        return side1 * side2;
    }
    
    public double perimeter()
    {
        return (side1*2) + (side2*2);
    }
    public String toString()
    {
        return "Area: " + area() + ", Perimeter: " + perimeter();
    }
}