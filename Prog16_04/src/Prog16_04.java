//Program 16_04: What value of b is displaying?
public class Prog16_04
{
    public static void main(String[] args) {
        int a = 1, b = 0;
        
        if (a==1)
            b = 2;
        else
            a = 3;
            b = a;
            
            System.out.println("This is b: " + b);
    }
}