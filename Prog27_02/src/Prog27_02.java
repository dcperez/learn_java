//Program 27_01
import java.util.*;
public class Prog27_02
{
    public static void main(String[] args) {
        
       new Prog27_02();
    }
    
    public Prog27_02()
    {
        Random rnd = new Random();
        
        int [] arr = new int[20];
        int size = 5;
        for (int i = 0; i < size;i++)
        {
            arr[i] = rnd.nextInt(10);
        }
        
        printArray(arr, size);
    }
    
    public void printArray(int[]a, int total)
    {
        for (int i = 0; i < total; i++)
        {
          System.out.print(a[i] + " ");
        }
    
        System.out.println();
        
    }     
}