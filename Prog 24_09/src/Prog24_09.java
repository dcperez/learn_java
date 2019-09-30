//Program 24_09: Random Numbers
import java.util.Random;
public class Prog24_09
{
    public static void main(String[] args) {
        Random rand = new Random();
        int[] randomIntegers = new int [10];
        
        for (int i = 0; i < randomIntegers.length; i++)
        {
            randomIntegers[i] = rand.nextInt(100);
            System.out.println(randomIntegers[i] + " ");
        }
        System.out.println();
    }
}