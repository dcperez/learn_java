/*Write a Java program that asks the user to enter a phrase with a word repeated 3 times in it and a String to replace those repeated words with.
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 4, Section U02
*/
public class Replacement1
{
    public static void main(String[] args) {
        
        String s = "a fish, a second fish, and a third fish";
        System.out.println(s);
        
        s = s.replaceAll("fish", "lion");
        
        System.out.println("\nNew Phrase: " + s);
                
    }
}