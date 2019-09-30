//Program 26_07: Upper/LowerBound of a random number
import java.util.*;

public class Prog26_07
{
    public static void main(String[] args) {
        new Prog26_07();
    }
    public Prog26_07()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Range for random number:");
        int lowerBound = in.nextInt();
        int upperBound = in.nextInt();
        
        System.out.println("Random number = " + randomNumber(lowerBound,upperBound));
    }
    public int randomNumber(int a, int b)
    {
        Random rnd = new Random();
        
        return a + rnd.nextInt(b-a+1);
    }
}