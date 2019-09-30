//Program 12_03: Using different number types
import java.util.*;
public class Prog12_03
{ 
    public static void main (String args[])
    {
        int i;
        float f;
        double d;
        
        int i1 = 22, i2 = 7;
        float f1 = 22, f2 = 7;
        double d1 = 22, d2 = 7;
        
        i = i1/i2; System.out.println(i);
        
        f = i1/f2; System.out.println(f);
        
        f = f1/f2; System.out.println(f);
        
        d = i1/d2; System.out.println(d);
        
        d = f1/f2;  System.out.println(d);
        
        d = f1/d2;  System.out.println(d);
        
        d = d1/d2;  System.out.println(d);
                
    }
}