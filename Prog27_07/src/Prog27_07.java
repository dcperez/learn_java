//Program 27_07

import java.util.*;

public class Prog27_07
{
    public static void main(String[] args) {
        new Prog27_07();
    }
    
    public Prog27_07()
    {
       int [] arr;
       arr = fillArray();
       
       for (int n : arr)
       {
           System.out.print(n + " ");
       }
        System.out.println();
    }
    
    public int[]fillArray()
    {
        Random rnd = new Random();
        int [] a = new int [10];
                for (int i = 0; i < a.length; i++)
                {
                    a[i] = rnd.nextInt(31);
                }
                
        return a;
    }
}