public class Circle {
    private double radius;
    private static int numberOfCircles = 0;
    
    public Circle() //default constructor
    {
        radius = 1;
        numberOfCircles++;
    }
    public Circle (double r) //parameterized constructor
    {
        radius = r;
        numberOfCircles++;
    }
    
    public static int getNumberOfCircles()
    {
        return numberOfCircles;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        radius = r;
    }
    public double area()
    {
        return Math.PI*Math.pow(radius,2);
    }
    
    public String toString()
    {
        return "Radius = " + radius + ", Area = " + area();
    }
}
