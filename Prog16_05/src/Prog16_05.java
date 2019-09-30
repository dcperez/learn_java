//Program 16_05: What value of b is displaying?
public class Prog16_05
{
    public static void main(String[] args) {
        int a = 1, b = 0;
        
        if (a==1)
            b = 2;
        else
        {
            a = 3;
            b = a;
        }
            System.out.println("This is b: " + b);
    }
}