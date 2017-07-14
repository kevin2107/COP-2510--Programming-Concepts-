import java.util.Scanner;
public class DivisionMistake
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner (System.in);
      int numerator, denominator, result;
      
      System.out.print("Enter numerator: ");
      numerator =  input.nextInt();
      
      System.out.print("Enter denominator: ");
      denominator =  input.nextInt();
      
      try
      {
         result =  numerator / denominator;
         System.out.println (numerator + " / " + denominator + " = "
                            + result);         
      }
      catch (ArithmeticException mistake) 
      //ArithmeticException class is part of java.lang package
      {
         System.out.println("Nope! What are you doing?!?");
  
         // This line allows you to print out the standard error message 
         System.out.println(mistake.getMessage());
      }  
   }
}