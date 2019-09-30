//Program 22_02
import java.util.*;
public class Prog22_02
{
    public static void main(String[] args) {
        int i = 0; //you cannot declare inside the loop, must be done as shown outside the loop/brackets
        
        do {
            i++; 
            System.out.println("i = " + i);
            
            if (i%2 == 0) i = 6;
            
        } while (i <= 5);
    }
}