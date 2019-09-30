 /**
        Team leader: <Gabriel Paz>, <PID: 3367185>, <Section: U13>
        Student: <Daniel Perez>, <PID: 4566551>, <Section: U02>
        Exercise description:
        4 - Exercise 7.7 of section Programming Projects in Chapter 7, page 366 of our textbook.
 */

import java.util.*;

public class Cop2210_Project 
{

 static Scanner in = new Scanner(System.in);
   static int[][] seatingChart;

    public static void main(String[] args)
    {
    seatingChart = new int[][] 
        {
          { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
          { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
          { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
          { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
          { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
          { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
          { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },
          { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
          { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 },
        };
       
    	//Introduction 
        System.out.println("Welcome to the Theater Seating Program");                
        System.out.println("\nPlease note the following:" + 
                           "\n-Row 1 is the bottom row of seats,\n and it is the closest to the screen." +
                           "\n-Column 1 is the column furthest to the left" +
                           "\n-A zero, labelled as \"0\", means the seat isn't available.\n");
       
       
        printSeatingChart(seatingChart);
        char choice1 = 'Y';
        while ((choice1 == 'Y') || (choice1 == 'y'))
        {
        System.out.print("\nChoose and option:"
                       + "\n-Pick by Seat: Enter < S > "
                       + "\n-Pick by Price: Enter < P > "
                       + "\n-Exit the program: Enter < E >:\n\n");
        char choice2 = in.next().charAt(0);
           switch (choice2)
            {
               case'S':case's':
               { 
                   sellSeatByLocation(seatingChart);
                   break; 
               }
               case'P':case'p':
               { 
                   sellSeatByPrice(seatingChart);
                   break; 
               }
               case'E':case'e':
               { 
                   System.out.println("Thank you, enjoy the show!");
                   System.exit(0); 
               }
               default:
               { 
                   System.out.println("Error: Invalid choice."); 
               }
            }
            System.out.print("Would you like to reserve another seat (Y/N)?: ");
            choice1 = in.next().charAt(0);
       }
       System.out.println("Thank you, enjoy the show!");
    }
    
    //Method for choosing seat by location
    public static void sellSeatByLocation(int seatingChart[][])
    {
       System.out.println("Enter a row, then enter a column seat.");
       System.out.print("What row would you like to sit on?:\n");
       int row = in.nextInt();
       row = Math.abs(row-9);
       System.out.print("What seat of that row would you like to sit in?:\n");
       int col = in.nextInt();
       col -= 1;
       if (seatingChart[row][col]!=0)
       {
           seatingChart[row][col] = 0;
           printSeatingChart(seatingChart);
           System.out.println();
           System.out.println("Your seat has been booked.");
       }
       else 
       { 
           System.out.println("Sorry, that seat is not available."); 
       }
    }
    
    //Method for choosing seat by price
    public static void sellSeatByPrice(int seatingChart[][])
    {
        System.out.print("Please enter a price for the seat you would like: ");
        int price = in.nextInt();
        out: for (int i=0;i<9;i++)
        for (int j=0;j<10;j++)
        if (seatingChart[i][j]==price)
        { 
            seatingChart[i][j]=0; break out; 
        } 
        printSeatingChart(seatingChart);
    }  

    //Method for printing out the seating chart
    public static void printSeatingChart(int seatingChart[][])
    {
       for(int i=0; i<seatingChart.length; i++)
       {
           for(int j=0; j<seatingChart[i].length; j++)
           {
                if (j>0)
                System.out.print("\t");
                System.out.print(seatingChart[i][j]);
           }
           System.out.println();
       }
    }
    
}