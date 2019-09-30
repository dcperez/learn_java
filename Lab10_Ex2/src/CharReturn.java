/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 10, Section U02

Write a getChar method that asks the user to enter a character and then returns it. Test your method.
*/
import java.util.*;

class CharReturn 
{

    public static void main(String[] args) 
    {   
    new GetChar();
    }        
}

class GetChar 
{
    public GetChar() 
    {
        System.out.println("The char entered was: " + myChar());
    }

   public static char myChar()
   {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Char: ");
        char myChar = in.next().charAt(0);
        return myChar;
   }

}
