public class Employee {
    
    private String firstName;
    private String lastName;
    private double salary;
    
    public Employee()
    {
       this.firstName = "Daniel";
       this.lastName = "Perez";
       this.salary = 30000;
    }
    public Employee(String fName, String lName, double s)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.salary = s;
    }
    public void raisedSalary(double raiseSalary) {

        this.salary += raiseSalary;
    }
    public String toString()
    {
        return "Employee Name: " + firstName + " " + lastName + ", Salary: $" + salary;
    }
}
