/* 
Program 27_09: Write a fillArray method that populates an integer array with 
random numbers. Pass the array as a parameter. Test your method.
 */
import java.util.*;

public class Prog27_09 {

    public static void main(String[] args) {

        new Prog27_09();
    }

    public Prog27_09() {
        int[] arr = new int[5]; //declare
        fillArray(arr);

        for (int c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public void fillArray(int[] a) {
        Random rnd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rnd.nextInt(31);
        }
    }
}
