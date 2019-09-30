/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 13, Section U02

Implement and test a class Employee. An employee has a first name (String), a 
last name (String) and a salary (double). A method raiseSalary and a method 
printEmployee will be implemented. The method raiseSalary will raise an employee
salary by the amount passed to the method as an argument value.
 */

public class Lab12_02_Tester
{
    public static void main(String[] args) {
  new Lab12_02_Tester();
}
    public Lab12_02_Tester()
    {
        Employee daniel = new Employee();
        daniel.printEmployee(); //initial value of salary is $30,0000
        
        daniel.raisedSalary(5000); //new value of salary will be $35,000
        daniel.printEmployee();
}
}