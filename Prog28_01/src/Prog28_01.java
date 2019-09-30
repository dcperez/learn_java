//Program 28_01

public class Prog28_01
{
    int counter;
    
    public static void main(String[] args) {
        new Prog28_01();
    }
    
    public Prog28_01()
    {
        //testing class variable
        System.out.println("Class Variable: ");
        counter = 0;
        incrementCounter();
        incrementCounter();
        incrementCounter();
        
        //testing local variable
        System.out.println("\nLocal Variable: ");
        localVariableTest();
        localVariableTest();
        localVariableTest();
    }
    
    public void incrementCounter()
    {
        System.out.println("counter = " + counter);
        counter++;
    }
    
    public void localVariableTest() //wont be remembered, will always start at 0, runs 3 times
    {
        int x = 0;
        System.out.println("x = " + x);
        x++;
        System.out.println("x = " + x);
    }
}