//Program 20_03: Practicing for loops
public class Prog20_03
{
    public static void main(String[] args) {
        
        double i;
        
        for (i = 1; i <= 10; i++){
            System.out.println("The square of " + i + " is " + Math.pow(i,2));
            System.out.println("The cube of " + i + " is " + Math.pow(i, 3));
        }
    }
}