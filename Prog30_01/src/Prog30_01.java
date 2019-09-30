import java.util.Random;
public class Prog30_01
{
    public static void main(String[] args) {
        new Prog30_01();
    }
    public Prog30_01()
    {
        Circle c = new Circle();
        
        c.printCircle();
        c.setRadius(2);
        c.printCircle();  
        
        c.setRadius(new Random().nextInt(10));
        System.out.println("New radius = " + c.getRadius());
            }
}