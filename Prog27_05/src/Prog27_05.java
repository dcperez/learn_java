//Program 27_05
import java.util.*;
public class Prog27_05
{
    public static void main(String[] args) {
        
       new Prog27_05();
    }
    
    public Prog27_05()
    {
        Random rnd = new Random();
        
        int [] a = new int[20];
        for (int i = 0; i < 5;i++)
        {
            a[i] = rnd.nextInt(100);
        }
        System.out.println("Max = " + maxValue(a,5));
    }
    
    public int maxValue(int[]a, int total)
    {
        int max = a[0];
        for (int i = 0; i < total; i++)
        {
            if (a[i] > max)
          max = a[i];
        }
        return max;
    }
}