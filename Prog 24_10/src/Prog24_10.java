//Program 24_10 Random numbers between 50 and 90
import java.util.Random;
public class Prog24_10
{
    public static void main(String[] args) {
        Random rand = new Random();
        int [] randomIntegers = new int [10];
        
        int sum = 0; // or you can declare as a double initially
        
        for (int i = 0; i < randomIntegers.length; i++)
        {
            randomIntegers[i] = 50 + rand.nextInt(41); //start at 50 + 41 random numbers to equal 90
            System.out.print(randomIntegers[i] + " "); // 90 max so do 91 - 50 = 41 random numbers
            
           sum += randomIntegers[i];
        }
        System.out.println("\n\nAverage = " + (sum/10.0));// or you can do ((double) sum/randomIntegers.length));
        
    }
}