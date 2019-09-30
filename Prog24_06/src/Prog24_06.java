//Program 24_06
public class Prog24_06
{
    public static void main(String[] args) {
        int [] xCoords = {10, -1, 15, 22, 34, -5, 17, 91, 0, 32};
        int [] yCoords = {6, 9, 86, -51, 20, 0, 7, 62, 30, 72};
        
        System.out.println("List of points: ");
        
        for (int i = 0; i < xCoords.length; i++)
        {
            System.out.println( "(" + xCoords[i] + " , " + yCoords[i] + ")");
        }
    }
}