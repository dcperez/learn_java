public class Pyramid
{
    public double height = 1;
    public double length = 2;
    public double width = 3;
    
    public double volume()
    {
        return (width*length*height)/3;
    }
    public void printPyramid()
    {
        System.out.println("Pyramid volume = " + volume());
    }
         
}