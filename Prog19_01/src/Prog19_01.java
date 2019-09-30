//Program 19_01: Other Operators
public class Prog19_01
{
    public static void main(String[] args) {
        int a = 0, b = 2, c = 3, d = 4, e = 6;
        
        a += 2;
        b *= c;
        d *= e + 5; //d * (e + 5)
        
       System.out.println("a = " + a);
       System.out.println("b = " + b);
       System.out.println("d = " + d + "\n");
       
       int i = 1, j = 2, k = 3, l = 4;
       
        System.out.println("i++ = " + i++); //i plus one from here on out
        System.out.println("i = " + i);
        System.out.println("++j = " + ++j); //j plus one but already implemented
        System.out.println("j = " + j);
        System.out.println("k-- = " + k--); // k minus one from here on out
        System.out.println("k = " + k);
        System.out.println("--l " + --l); // l minus one but already implemented
        System.out.println("l = " + l);
    }
}