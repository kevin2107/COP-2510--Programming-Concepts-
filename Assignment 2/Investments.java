//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Kevin Ramnauth

import java.util.Scanner;
import java.text.NumberFormat;

public class Investments
{
   //This program asks the user for an initial investment amount, annual interest rate
   //and number of years. The program then calculates and display the future investment value

    public static void main(String[] args)
    {

    //Declare Inputs
    Scanner scan = new Scanner(System.in);
    //Declare Variables
    double numberOfYears;
    double initial;
    double annualRate;
    double doubledoubleyears;
    double FutureAmt;
    double monthlyRate;
    double years;
    
    NumberFormat fmt = NumberFormat.getCurrencyInstance();

    System.out.print("Enter the investment amount: $");
      initial = scan.nextDouble();

    System.out.print("Enter annual interest rate(as a percentage): " + "%");
      annualRate = scan.nextDouble();

    System.out.print("Enter number of years: ");
      years = scan.nextDouble();

    monthlyRate = ((annualRate/100)/12.0); //turns your interest rate into a decimal then multiplies by 12
    numberOfYears = years*12;
    FutureAmt = (initial) * Math.pow((1 + monthlyRate), numberOfYears); //Forumla for FutureAmt = CurrentAmt * ( 1 + monthlyrate)^(numberOfYears * 12)

    System.out.println("Future value of " + fmt.format(initial) +
    " at an annual rate of " + annualRate +
    "% is " + fmt.format(FutureAmt));
    }
}