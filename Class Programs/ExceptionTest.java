import java.util.Scanner;  

public class ExceptionTest
{
   // OutOfRangeException is part of Exception class which is  
   // part of java.lang package
   public static void main (String [] args) throws OutOfRangeException 
   {  
      //Create an exception object
      OutOfRangeException invalid 
           = new OutOfRangeException("Hey dummy, that's an invalid number."); 
   
      int number;
      Scanner input = new Scanner(System.in);
      
      System.out.print ("Enter a positive integer: ");
      number = input.nextInt();
      
      if (number < 0)
         throw invalid; 
      
      System.out.print("Ok, your number is " + number + ".\nThank you!");
   }
}

