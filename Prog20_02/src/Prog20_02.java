//Program 20_01: Basic for loop

public class Prog20_02
{
    public static void main(String[] args) 
    {
        
        for (int counter = 0; counter < 10; counter++) //int declared inside the for loop; will only be declared for the loop. So if you wanna reuse the variable declare outside the for loop
        {
            System.out.println("Counter = " + counter);
        }
    }
}