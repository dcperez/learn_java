//Program 24_03

import javax.swing.*;
public class Prog24_03
{
    public static void main(String[] args) {
        double a [] = new double[5];
        
        //Fill the array with powers of two
        for (int i = 0; i < a.length; i++) //i < a.length is better than i < 5 because it accounts for any chances in the array size or capacity
        {
            a[i] = Math.pow(2,i);
        }
        
        //Prepare for displaying the values of a
        String s = "";
        
        for (int i = 0; i < a.length; i++)
        {
            s = s + (int) a[i] + "\n";
        }
        
        JOptionPane.showMessageDialog (null, s, "Output", JOptionPane.INFORMATION_MESSAGE);
    }
}