 import java.util.*; 
 public class Prog25_05 {
public static void main(String args[]) 
{
Random rnd = new Random();

ArrayList<Integer> a = new ArrayList<>();

for (int i = 0; i < 10; i++) {
a.add(rnd.nextInt(10));
}
System.out.println(a);
if (a.contains(0)) System.out.println("Found!");
else System.out.println("Not found!"); 
}
 }