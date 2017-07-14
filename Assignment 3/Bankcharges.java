//"I pledge my honor that I habe not cheated, and will not cheat, on this assignment" - Kevin Ramnauth
import java.util.Scanner;
import java.text.NumberFormat;

public class Bankcharges
{
   //This Program prompts the user for the total checks written this month then 
   //calulates the fee's due for that amount of checks.
   public static void main(String[] args)
   {
   //Declare Constants
      final double fee1 = 0.10;
      final double fee2 = 0.08;
      final double fee3 = 0.06;
      final double fee4 = 0.04;
      final double BaseFee = 10.00;
   //Declare Inputs
      Scanner IntputChecks = new Scanner(System.in);
   //Declare Variables
      double ChecksWritten, Total, TotalFee;      
      NumberFormat fmt = NumberFormat.getCurrencyInstance();   
   
      System.out.print("Enter the number of checks written this month: ");
         
      while(IntputChecks.hasNext())
      {
         if(!IntputChecks.hasNextInt())//Checks to see if entered value is an Int, if not restarts loop.
         {     
            System.out.println("Sorry, that's an invalid input");
            System.out.print("Enter the number of checks written this month: ");
            IntputChecks.next();
            continue;          
         }
      
         ChecksWritten = IntputChecks.nextInt();//If input is a valid number calulates fees due for the month.      
      
         if (ChecksWritten <= 19 && ChecksWritten >= 0){
            TotalFee = fee1*ChecksWritten;
            Total = BaseFee + TotalFee;
            int CW = (int)ChecksWritten; //Changes double value to int
            System.out.println("The total fees due this month for " + CW + " checks is " + fmt.format(Total));
            break;
         }   
         else if(ChecksWritten >= 20 && ChecksWritten <= 39){
            TotalFee = fee2*ChecksWritten;
            Total = BaseFee + TotalFee;
            int CW = (int)ChecksWritten;//Changes double value to int
            System.out.println("The total fees this month for " + CW + " checks is " + fmt.format(Total));
            break;
         }
         else if(ChecksWritten >= 40 && ChecksWritten <= 59){
            TotalFee = fee3*ChecksWritten;
            Total = BaseFee + TotalFee;
            int CW = (int)ChecksWritten;//Changes double value to int
            System.out.println("The total fees this month for " + CW + " checks is " + fmt.format(Total));
            break;
         }
         else if(ChecksWritten >= 60){
            TotalFee = fee4*ChecksWritten;
            Total = BaseFee + TotalFee;
            int CW = (int)ChecksWritten;//Changes double value to int
            System.out.println("The total fees this month for " + CW + " checks is " + fmt.format(Total));
            break;
         }
         else{//If checks written is outsaide the range of an INT prompts the user for an appropiate value
            System.out.println("Invalid number, please enter a proper value");
            System.out.print("Enter the number of checks written this month: ");
            continue;
         }
      }
   }
}