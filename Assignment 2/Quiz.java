//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Kevin Ramnauth

import java.util.Scanner;
import java.util.Random;

public class Quiz
{
   //This program randomly genetates two numbers between 1-99 then quizes the users on 
   //the product of those two numbers.
    public static void main(String[] args)
    {
    //Declare Constants
    final int MAX = 90;//max will not include 100
    //Declare Inputs
    Scanner input = new Scanner(System.in);
    Random generator = new Random(); 
    //Declare Variables
    int random1;
    int random2;
    int answer;
    int useranswer;
  
     
    random1 = generator.nextInt(MAX)+10;//generates two numbers between 10 - 99
    random2 = generator.nextInt(MAX)+10;
    answer = random1 * random2; // Calculates the correct answer
    
    System.out.println("Compute the following question (without a calculator): ");
    System.out.print(random1 + " * " + random2 + " = ");    
      useranswer = input.nextInt();
    
    if (useranswer == answer)
    {
      System.out.println("Correct!");
    } else 
      {
      System.out.println("Nice try, but the answer is " + answer + ".");      
      }  
    }
}