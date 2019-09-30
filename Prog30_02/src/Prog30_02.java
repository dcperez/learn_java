
import java.util.Random;

public class Prog30_02
{
    public static void main(String[] args) {
   new Prog30_02();
}
    public Prog30_02()
    {
       Sphere s1 = new Sphere();
        
       s1.printSphere();
       s1.setRadius(2);
       s1.printSphere();
       System.out.println(s1.getRadius());
       
       s1.setRadius(new Random().nextInt(10));
        System.out.println("New radius = " + s1.getRadius());
}
}