/**
 * Tests the Pyramid class.
 * @author danielperez
 */

public class Prog33_03 //toString method
{
    public static void main(String[] args) {
  new Prog33_03();
}
    public Prog33_03()
    {
        Pyramid p1 = new Pyramid();
        Pyramid p2 = new Pyramid(10, 10, 10);
        
        System.out.println("Pyramid 1: " + p1);
        System.out.println("Pyramid 2: " + p2);
    }   
}