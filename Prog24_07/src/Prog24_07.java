//Program 24_07: Array Practice
public class Prog24_07
{
    public static void main(String[] args) {
         double [] a = new double [50];
         
         for (int i = 0; i < a.length/2; i++)
         {
             a[i] = Math.pow(i,2);
         }
         
         for (int i = a.length/2; i < a.length; i++)
            {
                a[i] = Math.sqrt(i);
            }
         
         for (int i = 0; i < a.length; i++)
         {
             System.out.printf("%8.2f\n", a[i]);
         }
         System.out.println();
    }
}