/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 11, Section U02

Write a printDate method that displays the current date. No value to be passed 
or returned. Test the method by invoking it from the class constructor.
*/

import java.util.*;

class PrintDate 
{
    public static void main(String[] args) 
    {
        new GetDate();
    }
}
class GetDate {

    Date date = new Date();

    public GetDate() {
        printDate();
    }

    void printDate() {
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Date:", date);
        System.out.println("");
    }
}
