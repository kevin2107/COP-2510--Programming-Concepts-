//"I pledge my Honor that I have not cheated, and will not cheat, on this assignment" Kevin Ramnauth

import java.util.Scanner;

public class SphereDriver
{
   public static void main(String[] args)
   {
   //Declare Inputs
   Scanner Input  = new Scanner(System.in);
   //Declare Variables
   double inputRadius;
   //Create objects
   Sphere Sphere1 = new Sphere();
   Sphere Sphere2 = new Sphere(4.5);

   System.out.println("Initial Information for the 2 spheres");
   System.out.println(Sphere1);
   System.out.println(Sphere2);

   while (true)
   {
      System.out.print("Enter the radius for a Sphere: ");
         inputRadius = Input.nextDouble();

      if (inputRadius >= 0 )
      {
         Sphere1.setRadius(inputRadius);
         break;
      }
      else
      {
         System.out.println("Pleae Enter a postive number");
         continue;
      }
   }
   
   System.out.println("\nFinal Information for the 2 spheres");
   System.out.println(Sphere1);
   System.out.println(Sphere2);
   }
}
