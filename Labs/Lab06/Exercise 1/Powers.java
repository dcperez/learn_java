/*
Student name: Daniel Perez, Panther ID: 4566551; Student name: Miguel Cortes, Panther ID: 6065483
Week 7, Section U02

Write a program that computes all powers of 2 from 2^0 up to 2^20.
*/
public class Powers
{
    public static void main(String[] args) {
        
        for (int i = 0; i <=20; i++){
            System.out.println("2^"+ i + " =" + Math.pow(2,i));
        }
    }
}