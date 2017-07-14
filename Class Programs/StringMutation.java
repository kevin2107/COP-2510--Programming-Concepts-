import java.util.Random;

//********************************************************************
// StringMutation.java Author: Lewis/Loftus
//
// Demonstrates the use of the String class and its methods.
//********************************************************************
public class StringMutation
{
//-----------------------------------------------------------------
// Prints a string and various mutations of it.
//-----------------------------------------------------------------
   public static void main(String[] args)
   {
      String phrase = "Change is inevitable";
      String mutation1, mutation2, mutation3, mutation4;
      System.out.println("Original string: \"" + phrase + "\"");
      System.out.println("Length of string: " + phrase.length());
      mutation1 = phrase.concat(", except from vending machines.");
      mutation2 = mutation1.toUpperCase();
      mutation3 = mutation2.replace('E', 'X');
      mutation4 = mutation3.substring(3, 30);
      // Print each mutated string
      System.out.println("Mutation #1: " + mutation1);
      System.out.println("Mutation #2: " + mutation2);
      System.out.println("Mutation #3: " + mutation3);
      System.out.println("Mutation #4: " + mutation4);
      System.out.println("Mutated length: " + mutation4.length());
      
      double num1 = Math.pow(10, 2);
      
      //num1 = generator.pow(10, 2); // Gets random number from all ints
      System.out.println("value: " + Math.exp(1));
   }
}