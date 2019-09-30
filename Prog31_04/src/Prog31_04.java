import java.util.Random;
public class Prog31_04
{
    public static void main(String[] args) {
        new Prog31_04();
    }
    public Prog31_04()
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(6); //parameterized automatically recognizes parameter and inserts 6
        
        c1.printCircle();
        
        c2.printCircle();
            }
}