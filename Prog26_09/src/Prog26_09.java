//Program 26_09: minMax passed to method

import java.util.*;

public class Prog26_09
{
    public static void main(String[] args) {
        new Prog26_09();
    }
    public Prog26_09()
    {
       Scanner in = new Scanner(System.in);
       minMax(1,2);
       minMax(2,1);
    }
    public void minMax(int a, int b)
    {
        if (a < b)
       {
           System.out.println("Min = " + a);
           System.out.println("Max = " + b);
       }
       else
       {
           System.out.println("Min = " + b);
           System.out.println("Max = " + a);
       }
}
}