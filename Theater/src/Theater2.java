import java.util.Scanner;
public class Theater2 {
    public static void main(String[] args) {
    	String choose= "";
    	int price= 0;
        int[][] prices= new int[][] {
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
        int row=0; int column= 0;
        do { System.out.print("Seat or price?: "); choose= scan.nextLine(); }
        while (!(choose.equals("seat") || choose.equals("price")));
        boolean occupied= false;
        while (!occupied) {
            if (choose.equals("seat")) {
            	do {
            		System.out.print("Row: ");row= scan.nextInt();
                    System.out.print("Column: ");column= scan.nextInt();
                    if(prices[row][column]!=0) {
                    	System.out.println("Seat is yours!");
                    	prices[row][column]= 0;
                    	break;
                    }
                    else System.out.println("Seat occupied, try another.");
            	}
            	while(prices[row][column]== 0);
            	occupied= true;
            } 
            else if (choose.equals("price")) {
            	while(!occupied) {
            		System.out.print("Price: "); price= scan.nextInt();
            		if (!(price%10>=1 && price%10<=6)) {
	                    for (int i= 0; i< prices.length; i++) {
	                        for (int j= 0; j< prices[i].length; j++) {
	                            if (prices[i][j]== price) {
	                                occupied= true;
	                                prices[i][j]= 0;
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