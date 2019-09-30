//Program 28_02

import java.util.*;

public class Prog28_02
{
    int [] a;
    
    public static void main(String[] args) {
        new Prog28_02();
    }
    
    public Prog28_02()
    {
       a = new int [10];
        fillArray();
        printArray();
    }
    
    public void fillArray(int [] a)
    {
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(31);
    }
    
    public void printArray(int [] a)
        {
            System.out.println(arr);
        }
}