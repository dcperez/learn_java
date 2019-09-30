//Program 24_05: Practing 1D Arrays
public class Prog24_05
{
    public static void main(String[] args) {
        
        double [] a = new double[11];
        
        for (int i = 0; i < a.length; i++)
        {
            a[i] = Math.pow(i,2);
            System.out.println(i + "^2: " + a[i]);
                    
        }
    }
}