public class Square
{
    public double side = 2;
    
    public double area()
    {
        return Math.pow(side, 2);
    }
    public void printSquare()
    {
        System.out.println("Area: " + area());
    }
}