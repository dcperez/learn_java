//Program 20_05: for loops with char types

public class Prog20_05
{
    public static void main(String[] args) {
        int columns = 0;
        for (char i = 'A'; i <= 'Z'; ++i){
            System.out.println(i + " ");
            columns++;
            if (columns == 10) { //insert a new line once 10 letters are displayed
                System.out.println();
                columns = 0;
            }
        }
        System.out.println();
    }
}