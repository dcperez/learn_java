public class Circle {
    private double radius;
    
    public Circle()
    {
        radius = 5;
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
