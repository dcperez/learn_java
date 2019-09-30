/**
 * Implements the Pyramid class. Based on Prog31_11.
 * @author danielperez
 * @Version 1.0
 * @since 2019-04-18
 */
public class Pyramid
{
    private double height;
    private double length;
    private double width;
    
   /**
    * Default constructor.
    */
    public Pyramid()
    {
        height = 1;
        length = 2;
        width = 3;
    }
    
    /**
     * Parameterized constructor.
     * @param h height of the pyramid
     * @param l length of the pyramid
     * @param w width of the pyramid
     */
    public Pyramid(int h, int l, int w)
    {
        height = h;
        length = l;
        width = w;
    }
    
    /**
     * Returns the height of the pyramid
     * @return the height of the pyramid
     */
    public double getHeight()
    {
        return height;
    }
    
    /**
     * Returns the length of the pyramid
     * @return the length of the pyramid
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * Returns the width of the pyramid
     * @return the width of the pyramid
     */
    public double getWidth()
    {
        return width;
    }
    
    /**
     * Sets the height of the pyramid
     * @param h the height of the pyramid
     */
    public void setHeight(double h)
    {
        height = h;
    }
    
    /**
     * Sets the length of the pyramid
     * @param l the length of the pyramid
     */
    public void setLength(double l)
    {
        length = l;
    }
    
    /**
     * Sets the width of the pyramid
     * @param w the width of the pyramid
     */
    public void setWidth(double w)
    {
        width = w;
    }
    
    /**
     * Sets all parameters of the pyramid
     * @param h the height of the pyramid
     * @param l the length of the pyramid
     * @param w the width of the pyramid
     */
    public void setPyramid(double h,double l, double w)
    {
        height = h;
        length = l;
        width = w;
    }
    
    /**
     * Calculates the volume of the pyramid
     * @return the volume of the pyramid
     */
    public double volume()
    {
        return (width*length*height)/3;
    }
    
    /**
     * Returns the description of the pyramid
     * @return string description of the pyramid
     */
    public String toString()
    {
        return "Pyramid volume = " + volume();
    }
}
         