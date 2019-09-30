public class Professor
{
    public String firstName()
    {
        return "Antonio";
    }
    
    public String lastName()
    {
        return "Hernandez";
    }
    
    public String researchArea()
    {
        return "Computer Science";
    }
    
    public void printStudent()
    {
        System.out.println("Professor's name: " + firstName() + " " + lastName());
        System.out.println("Research area: " + researchArea());
        System.out.println();
        
    }
}

