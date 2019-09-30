public class Student
{
    public String firstName()
    {
        return "Daniel";
    }
    
    public String lastName()
    {
        return "Perez";
    }
    
    public double gpa()
    {
        return 4.0;
    }
    
    public void printStudent()
    {
        System.out.println("Student's name: " + firstName() + " " + lastName());
        System.out.println("GPA: " + gpa());
        System.out.println();
        
    }
}

