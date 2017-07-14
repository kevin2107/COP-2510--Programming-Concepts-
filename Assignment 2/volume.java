//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Kevin Ramnauth

import java.util.Scanner;
import java.text.DecimalFormat;

public class volume
{
      //This proram prompts the user for the radius of a sphere then 
      //calculates and displays the volume and surface area
      //Rounds to 4 decimal places
      
    public static void main(String[] args)
    {
    //Declare Inputs
    Scanner scan = new Scanner(System.in);
    //Declare Variables
    double radius,volume,surface;
    
    DecimalFormat Round4 = new DecimalFormat ("0.####");
    
    System.out.print("Enter the sphere's radius: ");
      radius = scan.nextDouble();
      
    volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);//Formula for volume  
    System.out.println("Volume: " + Round4.format(volume));
    
    surface = 4 * Math.PI * Math.pow(radius, 2);//Formula for surface area
    System.out.println("Surface Area: " + Round4.format(surface));
    }
}