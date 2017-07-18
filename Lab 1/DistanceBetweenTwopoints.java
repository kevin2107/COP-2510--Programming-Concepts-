//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Kevin Ramnauth

import java.util.Scanner;
import java.text.DecimalFormat;

public class DistanceBetweenTwopoints
{
   public static void main(String[] args)
   {
   //Declare Constants

   //Declare Inputs
   Scanner scan = new Scanner(System.in);
   //Declare Variables
   int firstXvalue;
   int secondXvalue;
   int firstYvalue;
   int secondYvalue;
   double intheroot;
   double Distance;
   
   DecimalFormat fmt = new DecimalFormat("0.###");   
   
   System.out.print("Enter the first x coordinate value: ");
         firstXvalue = scan.nextInt();
         
   System.out.print("Enter the first Y coordinate value: ");
         firstYvalue = scan.nextInt();
         
   System.out.print("Enter the second x coordinate value: ");
         secondXvalue = scan.nextInt();
         
   System.out.print("Enter the second Y coordinate value: ");
         secondYvalue = scan.nextInt();
   
   intheroot = Math.pow(secondXvalue - firstXvalue,2) + Math.pow(secondYvalue - firstYvalue,2); //Find sum of x and y values
   Distance = Math.sqrt(intheroot); //apply sqrt
   System.out.print("The distance between (" + firstXvalue + "," + firstYvalue);
   System.out.print(") and (" + secondXvalue + "," + secondYvalue + ") is " + fmt.format(Distance));      
   } 
}
