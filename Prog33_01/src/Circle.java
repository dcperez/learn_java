/**
 * Implements a Circle class. Based on Prog31_09
 * 
 * @author danielperez
 * @version 1.0
 * @since 2019-04-18
 */

public class Circle {
    private double radius;
    
    /**
     * Default constructor.
     */
    public Circle()
    {
        radius = 5;
    }
    
    /**
     * Parameterized constructor.
     * @param r radius of circle
     */
    public Circle (double r)
    {
        radius = r;
    }
    
    /**
     * Returns the radius of the circle.
     * @return the radius of the circle
     */
    public double getRadius()
    {
        return radius;
    }
    
    /**
     * Sets the radius of the circle.
     * @param r the radius of the circle.
     */
    public void setRadius(double r)
    {
        radius = r;
    }
    
    /**
     * Calculates the area of the circle.
     * @return the area of the circle
     */
    public double area()
    {
        return Math.PI*Math.pow(radius,2);
    }
    
    /**
     * Returns the description of this circle.
     * @return  string describing this circle
     */
    public String toString()
    {
        return "Radius = " + radius + ", Area = " + area();
    }
}
