//Program 13_08

import java.util.*;

public class Prog13_08
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s = "Hello, everyone. Hello!";
        System.out.println(s);
        in.nextLine();
        
        s = s.replaceFirst("Hello", "Hi");
        System.out.println(s);
        in.nextLine();
        
        s = s.replaceFirst("Hello", "Good morning");
        System.out.println(s);
                
    }
}