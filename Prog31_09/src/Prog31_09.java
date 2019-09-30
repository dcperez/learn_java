import java.util.Random;
public class Prog31_09
{
    public static void main(String[] args) {
        new Prog31_09();
    }
    public Prog31_09()
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(6);
        
        System.out.println("Circle 1: " + c1);
        System.out.println("Circle 2: " + c2);
    }
}