public class Circle {
    private double radius;
    
    public Circle() //default constructor
    {
        radius = 5;
    }
    public Circle (double r) //parameterized constructor
    {
        radius = r;
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
    
    public void printCircle()
    {
        System.out.println("Radius = " + radius + ", Area = " + area());
    }
}
