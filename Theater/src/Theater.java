import java.util.Arrays;
import java.util.Scanner;
public class Theater {
    public static void main(String[] args) {
    	String choose= "";
    	int price= 0;
        int[][]seatPrices = {
        	{10,10,10,10,10,10,10,10,10,10},
        	{10,10,10,10,10,10,10,10,10,10},
        	{10,10,10,10,10,10,10,10,10,10},
        	{10,10,20,20,20,20,20,20,10,10},
        	{10,10,20,20,20,20,20,20,10,10},
        	{10,10,20,20,20,20,20,20,10,10},
        	{20,20,30,30,40,40,30,30,20,20},
        	{20,30,30,40,50,50,40,30,30,20},
        	{30,40,50,50,50,50,50,50,40,30},
        };
        Scanner scan= new Scanner(System.in);
        int row=0; int column= 0, option;
        System.out.println("Would you like to choose a seat or know a price? \n1. Choose a seat \n2. Know a price \n3. Quit");
        do { System.out.print("Seat or price?: "); choose= scan.nextLine(); }
        while (!(choose.equals("seat") || choose.equals("price")));
        boolean occupied= false;
        while (!occupied) {
            if (choose.equals("seat")) {
            	do {
                    System.out.println("   1  2  3  4  5  6  7  8  9  10");  
    for (int i =0; i < seatPrices.length; i++)
    {
            System.out.print(i + " ");
        
            for (int j = 0; j < seatPrices[1].length; j++)
            {
            System.out.print(" ");
            System.out.print(seatPrices[i][j]);
            }
        System.out.println();
        }
        System.out.println("     ___________________________");
        System.out.println("                Stage        ");
        
            		System.out.print("Row: ");row= scan.nextInt();
                    System.out.print("Column: ");column= scan.nextInt();
                    if(seatPrices[row][column]!=0) {
                    	System.out.println("Seat is yours!");
                    	seatPrices[row][column]= 0;
                    	break;
                    }
                    else System.out.println("Seat occupied, try another.");
            	}
            	while(seatPrices[row][column]== 0);
            	occupied= true;
            } 
            else if (choose.equals("price")) {
            	while(!occupied) {
            		System.out.print("Price: "); price= scan.nextInt();
            		if (!(price%10>=1 && price%10<=6)) {
	                    for (int i= 0; i< seatPrices.length; i++) {
	                        for (int j= 0; j< seatPrices[i].length; j++) {
	                            if (seatPrices[i][j]== price) {
	                                occupied= true;
	                                seatPrices[i][j]= 0;
	                                System.out.printf("Seat ("+i+","+j+") is yours.");
	                                break;
	                            }
	                        }
	                        if (occupied) break;
	                    }
            		}
            		else System.out.println("try again");
            	}
            }
        }
    }
}