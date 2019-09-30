public class Pyramid
{
    private double height;
    private double length;
    private double width;
    
    public Pyramid()
    {
        height = 1;
        length = 2;
        width = 3;
    }
    public Pyramid(int h, int l, int w)
    {
        height = h;
        length = l;
        width = w;
    }
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
    public String toString()
    {
        return "Pyramid volume = " + volume();
    }
}
         