//"I pledge my Honor that I have not cheated, and will not cheat, on this assignment" Kevin Ramnauth
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class WordCount
{
   public static void main(String[] args)throws IOException
   {
   //Declare Inputs
   File inputfile = new File("TheRaven.txt");//Opens Files
   Scanner scan = new Scanner (inputfile);
   //Declare Variables
   int count=0;

   JOptionPane.showMessageDialog(null, "This code lets a user enter a word and checks\n 'The Raven'" +
   " to see how many times it appears.");

   String input = JOptionPane.showInputDialog("Enter a word to looks for: ");

   while (scan.hasNext())
   {
      String check = scan.next();
      if (input.equalsIgnoreCase(check))//Scans each word and compares it to the input word
      {
         count++;
      }      
   }
   
   JOptionPane.showMessageDialog(null, "The word " + input + " appears " + count + " times");
   
   scan.close();

   }
}


