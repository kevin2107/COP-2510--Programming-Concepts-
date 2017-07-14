//Example 4 - using a try catch with multiple catches (and a finally block)

import java.util.*;  // for Scanner and InputMismatchException classes
public class DivisionMistakeVer2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner (System.in);
      
      // initialized to 'safe values' to test exception
      int numerator = 0, denominator = 1, result = 0; 
            
      try
      {
         System.out.print("Enter numerator: ");
         numerator =  input.nextInt();
      
         System.out.print("Enter denominator: ");
         denominator =  input.nextInt();

         result =  numerator / denominator;
         System.out.println (numerator + " / " + denominator + " = "
                            + result);          
      }
      // A more robust version - corrects the errors
      catch (ArithmeticException mistake) 
      {
         while (denominator == 0)
         {
             System.out.print("Can't divide by zero. ");
             System.out.print("Re-enter denominator: ");
             denominator =  input.nextInt();
         }
         result =  numerator / denominator;
         System.out.println (numerator + " / " + denominator + " = "
                            + result); 
      }
      
      catch (InputMismatchException mistake) 
      {    
         System.out.print("Wrong Data Type! ");
      }  
      finally
      {
         System.out.print("This is the end of the program.");
      }
      
        
   }
}
  
