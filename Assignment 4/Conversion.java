//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Kevin Ramnauth

import java.util.Scanner;

public class Conversion
{

  //This program will convert distance in meters to yards, inches, or feet

   public static void main(String[] args)
   {
   //Declare Inputs
   Scanner InputMeters = new Scanner (System.in);
   //Declare Variables
   double meters;
   int number;

   System.out.println("Hello!\n");
   System.out.println("This program will convert distance in meters to yards, inches, or feet\n");

   System.out.print("Enter your distance in meters: ");

   while(InputMeters.hasNext())
      {
      if(!InputMeters.hasNextDouble())// Checks to see if entered value is an Int
      {
        System.out.println("Sorry, than's an invalid input");
        System.out.print("Enter your distance in meters: ");
        InputMeters.next();
        continue;
      }

      meters = InputMeters.nextDouble();

      if (meters < 0){
         //Check for positive numbers
         System.out.println("Please enter a positive number!");
         System.out.print("Enter your distance in meters: ");
         continue;
      }
      else if(0 < meters){
         menu(meters);

      }
      else{
         System.out.println("Invalid number");
         System.out.print("Enter your distance in meters: ");
         continue;
      }
   }
   }

   public static void menu (double meters)
   {
   //Menu

      //Declare Inputs
      Scanner MenuSelection = new Scanner (System.in);
      Scanner RunAgain = new Scanner(System.in);
      //Declare Variables
      int number;
      boolean reset = false;


      while(!reset)
      {
      System.out.println("\nSelect a choice from the menu.");
      System.out.println("1. Convert to yards");
      System.out.println("2. Convert to inches");
      System.out.println("3. Convert to feet\n\n");
      System.out.print("Enter your choice: ");

      if(!MenuSelection.hasNextInt())// Checks to see if entered value is an Int
      {
        System.out.println("Sorry, than's an invalid input");
        System.out.print("Enter your choice: ");
        MenuSelection.next();
      }

      number = MenuSelection.nextInt();

      switch(number)
      {
         case 1:
         double yards = showYards(meters);
         System.out.println(meters   " meters is "   yards   " yards.");
         System.out.print("\nRun program again? ");
            String ry = RunAgain.nextLine();
            if (ry.equals("no")){
               reset = true;
               }
         break;
         case 2:
         showInches(meters);
         System.out.print("\nRun program again? ");
            String ri = RunAgain.nextLine();
            if (ri.equals("no")){
               reset = true;
               }
         break;
         case 3:
         showFeet(meters);
         System.out.print("\nRun program again? ");
            String rf = RunAgain.nextLine();
            if (rf.equals("no")){
               reset = true;
               }
         break;
         default:
         System.out.println("Please select a valid menu choice.");
         continue;
      }
    }
   }

   public static double showYards(double meters)
   {
   //Yards
   double yards = meters *1.09361;
   return yards;
   }

   public static double showInches(double meters)
   {
   //Inches
   double inch = meters *39.3701;
   System.out.println(meters   " meters is "   inch   " inches.");
   return inch;
   }

   public static double showFeet(double meters)
   {
   //Feet
   double feet = meters * 3.28084;
   System.out.println(meters   " meters is "   feet   " feet.");
   return feet;
   }


}

