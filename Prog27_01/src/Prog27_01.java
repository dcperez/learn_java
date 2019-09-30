//Program 27_01
import java.util.*;
public class Prog27_01
{
    public static void main(String[] args) {
        
       new Prog27_01();
    }
    
    public Prog27_01()
    {
        Random rnd = new Random();
        
        int [] arr = new int[5];
        for (int i = 0; i < arr.length;i++)
        {
            arr[i] = rnd.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("\nSum of array elements = " + arraySum(arr));
    }
    
    public int arraySum(int[]a)
    {
        int sum = 0;
        for (int n : a)
        {
            sum += n;
        }
        return sum;
    }
}