//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Kevin Ramnauth

import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;

public class Rainfall
{

   public static void main(String[] args)
   {
      //Declare Constants

      //Declare Inputs
      Scanner InputInches = new Scanner(System.in);
      //Declare Variables
      DecimalFormat fmt = new DecimalFormat("0.##");
      String[] Months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
      int monthCounter = 11;
      double[] Rainfall = new double[12];
      double sum = 0;
      double average = 0;
      double highestRain=0;
      double lowestRain=9999;
      boolean reset = true;
      String highMonth="";
      String lowMonth="";

      do
      {
         for (int i = 0; i <= monthCounter;i++)//Enter rainfall for months 1-12 and adds them to the Rainfall array
         {
            System.out.print("Enter Rainfall(in inches) for " + Months[i] + ": ");

            if(!InputInches.hasNextDouble())// Checks to see if entered value is a double
            {
               i--;
               System.out.println("Sorry, than's an invalid input");
               InputInches.next();
               continue;
            }

            Rainfall[i] = InputInches.nextDouble();

            if(Rainfall[i] > 0)// Checks to make sure input is greater than zero
            {
               sum += Rainfall[i];
            }
               else
               {
                  i--;
                  System.out.println("Please Enter a positive number");
                  continue;
               }

            if (Rainfall[i] >= highestRain)//Checks for highest input
            {
               highestRain = Rainfall[i];
               highMonth = Months[i];
            }
            
            if (Rainfall[i] <= lowestRain)//Checks for lowest input
            {
               lowestRain = Rainfall[i];
               lowMonth = Months[i];
            }

         }

         System.out.println("\nTotal Rainfall for the year is " + sum + " inches");

         average = sum/Rainfall.length;
         System.out.println("The average rainfall for the year is " + fmt.format(average) +  " inches");

         System.out.println("The highest rainfall for the year is " + fmt.format(highestRain) + " inches in " + highMonth);

         System.out.println("The lowest rainfall for the year is " + fmt.format(lowestRain) + " inches in " + lowMonth);

         while (true)//Reset Program Loop, depends on java.util.Arrays.
         {
            String[] yes = {"yes","y","YES","ye","y","Y","yess","yas"};
            String[] no = {"NO","no","n","N","nO","No"};
            Scanner resetProg = new Scanner(System.in);
            String runagain;

            System.out.print("\nRun program again? (yes or no) ");
               runagain = resetProg.next();
            if (Arrays.asList(yes).contains(runagain))
            {
               System.out.print("\n");
               reset = true;
               break;
            }
            else if (Arrays.asList(no).contains(runagain))
            {
               reset = false;
               break;
            }
            else
            {
               System.out.println("Invalid Command");
            }
         }
      }while(reset);
   }
}
