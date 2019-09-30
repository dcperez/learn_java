public class Square
{
    private double side;
    
    public Square()
    {
        side = 4;
    }
    public Square (double s)
    {
        side = s;
    }
    public double getSide()
    {
        return side;
    }
    public void setSide(double s)
    {
      side = s;  
    }
    public double area()
    {
        return Math.pow(side, 2);
    }
    public String toString()
    {
        return "Area: " + area();
    }
}