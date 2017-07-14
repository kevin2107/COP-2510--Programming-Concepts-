//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Kevin Ramnauth
import java.util.Scanner;

public class mintoyears
{
   public static void main(String[] args)
   { 
   double inputMinutes;
   
   //Declare constants 
   final int daystoyear = 365;
   final int mintoday = 1440;
   
   //Declare input  
   Scanner input = new Scanner(System.in);   
     
   System.out.print("Enter the minutes: ");
      inputMinutes = input.nextDouble();
   
   double minuteToDay = inputMinutes/mintoday;
   double years = daystoyear/minuteToDay;
   System.out.println("years " + years);
   System.out.println("days: " + minuteToDay);
   }
}

