//Program20_08: Write a Java program that adds all multiples of 5 between 50 and 100 (inclusive).
public class Prog20_08
{
    public static void main(String[] args) {
       int sum = 0;
        for (int i = 50; i <= 100; i+=5){
            sum += i;
    }
        System.out.println("Sum = " + sum);
    }
}