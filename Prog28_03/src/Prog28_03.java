//Program 28_03: Overloaded Methods

public class Prog28_03
{
    public static void main(String[] args) {
        
        new Prog28_03();
    }
    
    public Prog28_03()
    {
        System.out.println("Sign = " + sign((byte)-5));
        System.out.println("Sign = " + sign((short)14));
        System.out.println("Sign = " + sign(0));
    }
    
    public byte sign(byte x)
    {
        System.out.print("BYTE: ");
        if (x<0) return -1;
        else
            if (x==0) return 0;
            else return 1;
    }
    
    public short sign(short x)
    {
        System.out.print("SHORT: ");
        if (x<0) return -1;
        else
            if (x==0) return 0;
            else return 1;
    }
    
    public int sign(int x)
    {
        System.out.print("INT: ");
        if (x<0) return -1;
        else
            if (x==0) return 0;
            else return 1;
    }
}