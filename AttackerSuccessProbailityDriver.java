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
   
   public double solveAttackerSuccessProbability(double q, int z)
   {
      double p = 1.0 - q;
      double lambda = z * (q/p);
      double sum = 1.0;
      int i, k;
      for (k = 0; k <= z; k++)
      {
         double poisson = Math.exp(-lambda);
         for (i = 1; i <= k; i++)
          poisson *= lambda / i;
         sum -= poisson * (1- Math.pow(q/p, z -k));
       }
       return sum;
   }

   
   AttackerSuccessProbability ASP = new AttackerSuccessProbability();
   
   System.out.println(sum);

   }
}
