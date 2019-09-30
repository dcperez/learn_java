/* Write a Java program that asks the user to enter a phrase with a word repeated 3 times in it and three different words to use as a replacement.
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 4, Section U02
*/
import java.util.*;

public class Replacement2
{
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        String s = "my cat, your cat, our cat";
        System.out.println(s);
        
        System.out.println("\n(To continue, hit Enter)");
        in.nextLine();
        
        s = s.replaceFirst("cat", "dog");
        System.out.println("\n" + "First replacement: " + s);
        
        System.out.println("\n(To continue, hit Enter)");
        in.nextLine();
        
        s = s.replaceFirst("cat", "bird");
        System.out.println("\n" + "Second replacement: " + s);
        
        System.out.println("\n(To continue, hit Enter)");
        in.nextLine();
        
        s = s.replaceFirst("cat", "horse");
        System.out.println("\n" + "Third replacement/New Phrase: " + s);
    }
}