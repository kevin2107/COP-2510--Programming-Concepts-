//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Kevin Ramnauth
import java.util.Scanner;

public class Restaurant
{
   //This program allows you to calcululate the total cost of your meal with a 15% tip after taxes given the subtotal
   public static void main(String[] args)
   {
      
   //Declare Constants  
   double tipPercent = 0.15;
   double taxPercent = 0.0675;
   
   //Declare Inputs 
   Scanner scan = new Scanner(System.in);
   
   //Declare Variables
   double chargedTotal;
   
   System.out.print("How much was your meal? ");
      chargedTotal = scan.nextDouble();//Ask for the total of your meal
   
   System.out.println("Subtotal:$" + chargedTotal);//Displays subtotal
   
   double tax = chargedTotal*taxPercent;//Calculates 6.75% of subtotal
   System.out.println("Tax:\t\t$" + tax);
   
   double taxTotal = (chargedTotal + tax);//Calulates the new subtotal with tax added
   double tip = taxTotal*tipPercent;//Calculates a 15% tip
   System.out.println("Tip:\t\t$" + tip);
   
   double total = chargedTotal + tip + tax;//Adds together the subtotal + tip + tax
   System.out.println("Total:\t$" + total);
   }
}

