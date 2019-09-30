//Program 25_01: ArrayLists
import java.util.ArrayList;
public class Prog25_01
{
    public static void main(String[] args) 
    {
        ArrayList<Double> bills = new ArrayList<>();
        
        for (int i = 0; i < 12; i++)
        {
            bills.add(29.99);
        }
        
        for (int i = 0; i < 12; i++)
        {
            double x = bills.get(i);
            System.out.println("Month " + (i + 1) + ": $" + x);
            
        }
    }
}
