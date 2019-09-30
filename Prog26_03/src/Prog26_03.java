//Program 26_03
import java.util.*;
public class Prog26_03
{
    public static void main(String[] args) {
        Prog26_03 myApp = new Prog26_03();
    }
    
    public Prog26_03()
    {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int max = a[0];
        for (int n : a)
        {
        if (n > max) max = n;
        }
        System.out.println("Max = " + max);
    }
}