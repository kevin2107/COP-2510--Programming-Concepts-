import java.util.Scanner;
 
class ReverseNumber
{
   public static void main(String args[])
   {
      int n, reverse = 0;
 
      System.out.print("Enter the number to reverse: ");
      Scanner input = new Scanner(System.in);
      n = input.nextInt();
      int p = n;
      while( n != 0 )
      {       
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
          System.out.println("R: " + reverse);
          System.out.println("N: " + n);
          
          
      }
      if (p == reverse)
      {
         System.out.println("ding ding " + reverse);        
      }
          
      System.out.println("Reverse of entered number is "+reverse);
   }
}