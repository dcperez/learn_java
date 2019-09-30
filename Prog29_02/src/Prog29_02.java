public class Prog29_02
{
    public static void main(String[] args) {
   new Prog29_02();
}
    public Prog29_02()
    {
        Sphere s1 = new Sphere();
        
       s1.printSphere();
       Sphere s2 = new Sphere();
       s2.radius = 4;
       s2.printSphere();
    }
}