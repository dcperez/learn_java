public class Employee {
    
    public String firstName = "Daniel";
    public String lastName = "Perez";
    public double salary = 30000;
    
    public void printEmployee()
    {
        System.out.println("Employee Name: " + firstName + " " + lastName + ", Salary: $" + salary);
    }
    
    public void raisedSalary(double raiseSalary) {

        salary += raiseSalary;
    }
}
