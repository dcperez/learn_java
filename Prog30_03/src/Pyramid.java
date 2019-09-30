public class Pyramid
{
    private double height = 1;
    private double length = 2;
    private double width = 3;
    
    public double getHeight()
    {
        return height;
    }
    public double getLength()
    {
        return length;
    }
    public double getWidth()
    {
        return width;
    }
    public void setHeight(double h)
    {
        height = h;
    }
    public void setLength(double l)
    {
        length = l;
    }
    public void setWidth(double w)
    {
        width = w;
    }
    public void setPyramid(double h,double l, double w)
    {
        height = h;
        length = l;
        width = w;
    }
    public double volume()
    {
        return (width*length*height)/3;
    }
    public void printPyramid()
    {
        System.out.println("Pyramid volume = " + volume());
    }
}
         