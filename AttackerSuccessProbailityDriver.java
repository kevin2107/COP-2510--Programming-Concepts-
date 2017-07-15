//"I pledge my Honor that I have not cheated, and will not cheat, on this assignment" Kevin Ramnauth

import java.util.Scanner;
import java.util.Arrays;

public class AttackerSuccessProbailityDriver
{
   public static void main(String[] args)
   {
   //Declare Inputs

   //Declare Variables

   //Create objects
   double q = .3;
   System.out.println("q= " + q);
      
   for (int z = 0; z < 10;z++)
   {
      AttackerSuccessProbability ASP = new AttackerSuccessProbability(q, z);
      System.out.println(ASP);
   }
     

   }
}
