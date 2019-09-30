import java.util.Random;
public class Prog34_01
{
    public static void main(String[] args) {
        new Prog34_01();
    }
    public Prog34_01()
    {
        System.out.println("Number of circles: " + Circle.getNumberOfCircles());
        
        Circle c1 = new Circle();
        System.out.println("Number of circles: " + Circle.getNumberOfCircles());
        
        Circle c2 = new Circle(6); //parameterized automatically recognizes parameter and inserts 6
        System.out.println("Number of circles: " + Circle.getNumberOfCircles());
            }
}