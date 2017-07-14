//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Kevin Ramnauth

import java.util.Scanner;

public class SecondConverter
{
   public static void main(String[] args)
   {
   //Declare Constants
   final int secHour = 3600;
   final int secMinute = 60;
   //Declare Inputs
   Scanner scan = new Scanner(System.in);
   //Declare Variables
   int hours,minute1,minute2,seconds,userinput;
   
   System.out.print("Enter the number of seconds: ");
      userinput = scan.nextInt();
   
   hours = userinput/secHour;//Calculate hours   
   System.out.println("Hours: " + hours);
   
   minute1 = (userinput) - (hours*secHour);//take seconds already calulated out of equation
   minute2 = (minute1/secMinute);//find left over minutes
   System.out.println("Minutes: " + minute2);
   
   seconds = minute1 - (minute2*secMinute);//find left over seconds
   System.out.println("Seconds: " + seconds);                 
   }
}
