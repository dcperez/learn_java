
import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;
  
public class LinkedListDemo {
    public static void main(String args[])
    {
        // Creating an empty LinkedList
        LinkedList<String> list = new LinkedList<String>();
  
        // Use add() method to add elements in the list
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
  
        // Displaying the linkedlist
        System.out.println("LinkedList:" + list);
       
        ListIterator list_Iter = list.listIterator(2);
  
        // Iterating through the created list from the position
        System.out.println("The list is as follows:");
        while(list_Iter.hasNext()){
           System.out.println(list_Iter.next());
        }
    }
}