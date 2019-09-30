//Program 24_01: A simple array application
public class Prog24_01
{
    public static void main(String[] args) 
    {
        double [] bills = new double [12];
        
        for (int i = 0; i < 12; i++)
        {
            bills[i] = 29.99;
        }
        for (int i = 0; i < 12; i++)
        {
            System.out.println("Month " + (i + 1) + ": $" + bills[i]);
        }
    }
}