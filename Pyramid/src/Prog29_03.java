public class Prog29_03
{
    public static void main(String[] args) {
  new Prog29_03();
}
    public Prog29_03()
    {
        Pyramid p1 = new Pyramid();
        p1.printPyramid();
        
        Pyramid p2 = new Pyramid();
        p2.height = 50;
        p2.printPyramid();
    }
}