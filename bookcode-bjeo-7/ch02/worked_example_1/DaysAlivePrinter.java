public class DaysAlivePrinter
{
   public static void main(String[] args)
   {
      Day danielPerezsBirthday = new Day(1995, 8, 25);
      Day today = new Day();
      System.out.print("Today: ");
      System.out.println(today.toString());
      int daysAlive = today.daysFrom(danielPerezsBirthday);
      System.out.print("Days alive: ");
      System.out.println(daysAlive);
   }
}
