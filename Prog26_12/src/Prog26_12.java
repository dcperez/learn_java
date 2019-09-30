//Program 26_12

import java.util.*;

public class Prog26_12 {

    public static void main(String[] args) {

        new Prog26_12();
    }

    public Prog26_12() {
        allTogether();
    }

    public void allTogether() {
        int n1 = getPositiveInt();
        int n2 = getPositiveInt();

        if (n1 == -1 || n2 == -1) {
            printError();
        } else {
            minMax(factorial(n1), (factorial(n2)));
        }
    }

    public void printError() {

        String str = "No value to be passed or returned.";
        System.out.println(str);
    }

    public int getPositiveInt() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if (n <= 0) {
            return -1;
        } else {
            return n;
        }
    }

    public int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public void minMax(int a, int b) {
        if (a < b) {
            System.out.println("Min = " + a);
            System.out.println("Max = " + b);
        } else {
            System.out.println("Min = " + b);
            System.out.println("Max = " + a);
        }
    }
}
