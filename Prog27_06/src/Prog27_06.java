//Program 27_06: Returning arrays

public class Prog27_06
{
    public static void main(String[] args) {
        
        new Prog27_06();
    }
    
    public Prog27_06()
    {
        char[] arr;
        arr = fillArray();
        
        for (char c : arr)
        {
            System.out.println(c + " ");
        }
        System.out.println();
    }
    
    public char[] fillArray()
    {
        char[] a = {'a','e','i','o','u'};
                
                return a;
    }
}