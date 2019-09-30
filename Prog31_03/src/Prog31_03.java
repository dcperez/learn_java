public class Prog31_03
{
    public static void main(String[] args) {
  new Prog31_03();
}
    public Prog31_03()
    {
        Pyramid p = new Pyramid();
        p.printPyramid();
        
        p.setHeight(5);
        p.setLength(5);
        p.setWidth(5);
        p.printPyramid();
        
        p.setPyramid(10, 10, 10);
        p.printPyramid();
    }
        
       
}