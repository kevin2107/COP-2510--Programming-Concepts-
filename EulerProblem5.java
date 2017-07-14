public class EulerProblem5
{
   public static void main(String[] args)
   {
      int result=0,reverse = 0,paladine = 0;
      
      for (int i=10; i < 9; i++)
      {
         System.out.print("\n " + i + ". ");
                 
         for (int p=10; p < 9; p++)
         {            
            int multiply = i * p;
            int b = multiply;
            System.out.print(i + " times " + p + " is ");
            System.out.print(multiply + " , ");
            
            while(b != 0)
            {  
               reverse = reverse * 10;
               reverse = reverse + b%10;
               multiply = b/10;         
            }
              
            if (b == multiply)
            {
               paladine = multiply;
               System.out.println("Paladine found: " + paladine + " ");       
            }                       
                         
         }            
      }
      System.out.println("\nLargest Paladine found: " + paladine); 
   }
}