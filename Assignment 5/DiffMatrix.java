//"I pledge my Honor that I have not cheated, and will not cheat, on this assignment" Kevin Ramnauth


import java.util.Scanner;

public class DiffMatrix
{
   public static void main(String[] args)
   {
   //Declare Inputs
   Scanner InputArray = new Scanner(System.in);
   //Declare Variables
   double[][] Matrix1 = new double[3][3];
   double[][] Matrix2 = new double[3][3];
   int i=0,j=0,k=0;
   
   //1st Matrix
   System.out.print("Enter Matrix 1: ");
      
   for (i = 0; i < 2; i++)
   {
      for (j=0; j < 2;j++)
      {
         Matrix1[i][j] = InputArray.nextDouble();
      }
   }

   //Second Matrix
   System.out.print("Enter Matrix 2: ");
   for(i = 0; i < 3; i++)
   {
      for (j=0; j < 3;j++)
      {
         Matrix2[i][j] = InputArray.nextDouble();
         
      }
   }
      
   System.out.println("\nThe difference of the matrices is: ");
   System.out.println(Matrix1);
   System.out.println("\n-\n");
   System.out.println(Matrix2);
   System.out.println("\n\n=\n");
   
   double[][] result = solveMatrix(Matrix1, Matrix2);
   
   System.out.println(result);
      
   }
   
   //Methods
   public static double [][] solveMatrix(double [][] Matrix1, double [][] Matrix2)
   {
      double[][] result = new double[3][3];
      int i,j;
      
      for (i = 0; i < 3; i++)
      {
          for (j=0; j < 3;j++)
          {
            result[i][j] = Matrix1[i][j] - Matrix2[i][j];
          }
      }
      return result;
   }
}   