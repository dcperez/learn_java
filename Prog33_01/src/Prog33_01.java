import java.util.Random;

/**
 * Tests the Circle class.
 * @author danielperez
 */
public class Prog33_01
{
    public static void main(String[] args) {
        new Prog33_01();
    }
    public Prog33_01()
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(6);
        
        System.out.println("Circle 1: " + c1);
        System.out.println("Circle 2: " + c2);
    }
}