//"I pledge my honor that I habe not cheated, and will not cheat, on this assignment" - Kevin Ramnauth
import java.util.Scanner;

public class VowelCount
{
   //This program returns the vowels in a string that the user inputs
   public static void main(String[] args)
   {
   //Declare Inputs
   Scanner input = new Scanner(System.in);
   //Declare Variables
   String UserString;
   int IndexPosition;
   int InputLength;
   int VowelCountA=0;
   int VowelCountE=0;
   int VowelCountI=0;
   int VowelCountO=0;
   int VowelCountU=0;
     
   System.out.print("Enter a string of characters: ");
      UserString = input.nextLine();
   System.out.println("Length Check: " + UserString.length());      
      InputLength = UserString.length();
         
   while (InputLength > 0)
   {
      IndexPosition = UserString.toLowerCase().charAt(InputLength  - 1);
      //Changes the User inputted string to lower case, then finds the character at the last index of string
      //loops until the whole length is checked
      switch (IndexPosition){
         case 'a':
            VowelCountA++;
            InputLength--;          
            break;
         case 'e':
            VowelCountE++;
            InputLength --;          
            break;
         case 'i':
            VowelCountI++;
            InputLength --;          
            break;
         case 'o':
            VowelCountO++;
            InputLength --;          
            break;
         case 'u':
            VowelCountU++;
            InputLength --;          
            break;           
         default: 
            InputLength --;
            break;                       
         }
      }
      System.out.println("Total Vowels in String: ");
      System.out.println("A: " + VowelCountA);
      System.out.println("E: " + VowelCountE);
      System.out.println("I: " + VowelCountI);
      System.out.println("O: " + VowelCountO);
      System.out.println("U: " + VowelCountU);
   }
}