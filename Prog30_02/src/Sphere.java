public class Sphere
{
    private double radius = 1;
    
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        radius = r;
    }
    public double volume()
    {
        return 4.0/3.0*Math.PI*Math.pow(radius,3);
    }  
    
    public double SurfaceArea()
    {
        return 4*Math.PI*Math.pow(radius,2);
    }
    
    public void printSphere()
    {
        System.out.println("Volume = " + volume() + ", Area = " + SurfaceArea());
    }
}